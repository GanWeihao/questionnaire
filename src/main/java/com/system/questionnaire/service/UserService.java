package com.system.questionnaire.service;

import com.system.questionnaire.model.User;

import java.util.List;

public interface UserService {
    //登录
    public User selectForlogin(User user);
    //注册
    public void insertSelective(User user);
    //所有用户
    public List<User> selectAll();
    //删除用户
    public void updateByPrimaryKeySelective(User user);
    //恢复用户
    public void updateById(User user);
    //根据用户名查找用户
    public List<User> selectByUserName(User user);
    //根据用户ID查找用户
    public User selectByPrimaryKey(User user);
}
