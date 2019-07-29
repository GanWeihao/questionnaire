package com.system.questionnaire.mapper;

import com.system.questionnaire.model.User;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

import java.util.List;

@Mapper
@Component("UserMapper")
public interface UserMapper {
    //登录
    User selectForlogin(User user);
    //注册
    void insertSelective(User record);
    //查询所有用户
    List<User> selectAll();
    //删除用户
    void updateByPrimaryKeySelective(User record);
    //根据用户名查找用户
    List<User> selectByUserName(User user);

    int deleteByPrimaryKey(String userId);

    int insert(User record);

    User selectByPrimaryKey(String userId);

    int updateByPrimaryKey(User record);
}