package com.system.questionnaire.controller;

import com.system.questionnaire.model.User;
import com.system.questionnaire.service.UserService;
import com.system.questionnaire.util.Constants;
import com.system.questionnaire.util.JsonResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {
    @Autowired
    UserService userService;

    //登录
    @ResponseBody
    @RequestMapping(value = "/user/login", method = RequestMethod.GET)
    public JsonResult login(User user){
        JsonResult js;
        System.out.println(user.getUserPhone());
        System.out.println(user.getUserPassword());
        try{
            User u = userService.selectForlogin(user);
            if(u!=null){
                if(u.getUserStatus()==0){
                    js = new JsonResult(Constants.STATUS_SUCCESS,"1",u);
                }else{
                    js = new JsonResult(Constants.STATUS_ERROR,"0");
                }
            }else{
                js = new JsonResult(Constants.STATUS_NOT_FOUND,"0");
            }
        }catch (Exception e){
            js = new JsonResult(Constants.STATUS_FAIL,"-1");
        }
        return js;
    }

    //注册
    @ResponseBody
    @RequestMapping(value = "/user/register", method = RequestMethod.GET)
    public JsonResult register(User user){
        JsonResult js;
        try{
            List<User> list = userService.selectByUserName(user);
            if(list.size()==0){
                userService.insertSelective(user);
                js = new JsonResult(Constants.STATUS_SUCCESS,"1");
            }else {
                js = new JsonResult(Constants.STATUS_ERROR,"0");
            }
        }catch (Exception e){
            js = new JsonResult(Constants.STATUS_FAIL,"-1");
        }
        return js;
    }
}
