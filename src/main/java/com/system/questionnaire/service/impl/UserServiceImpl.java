package com.system.questionnaire.service.impl;

import com.system.questionnaire.mapper.UserMapper;
import com.system.questionnaire.model.User;
import com.system.questionnaire.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.UUID;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    UserMapper userMapper;

    //登录
    @Override
    public User selectForlogin(User user){
        return userMapper.selectForlogin(user);
    }

    //注册
    @Override
    public void insertSelective(User user) {
        UUID uuid = UUID.randomUUID();
        String str = uuid.toString();
        String uuidStr = str.replace("-", "");
        user.setUserId(uuidStr);
        user.setUserStatus(0);
        user.setUserAttribute(0);
        userMapper.insertSelective(user);
    }

    //显示所有用户
    @Override
    public List<User> selectAll() {
        return userMapper.selectAll();
    }

    //删除用户
    @Override
    public void updateByPrimaryKeySelective(User user) {
        user.setUserStatus(1);
        userMapper.updateByPrimaryKeySelective(user);
    }

    @Override
    public void updateById(User user) {
        user.setUserStatus(0);
        userMapper.updateByPrimaryKeySelective(user);
    }

    @Override
    public List<User> selectByUserName(User user) {
        return userMapper.selectByUserName(user);
    }

    @Override
    public User selectByPrimaryKey(User user) {
        return userMapper.selectByPrimaryKey(user.getUserId());
    }

}
