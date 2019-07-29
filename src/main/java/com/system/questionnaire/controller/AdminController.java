package com.system.questionnaire.controller;

import com.system.questionnaire.model.Problem;
import com.system.questionnaire.model.Survey;
import com.system.questionnaire.model.User;
import com.system.questionnaire.service.ProblemService;
import com.system.questionnaire.service.SurveyService;
import com.system.questionnaire.service.UserService;
import com.system.questionnaire.util.Constants;
import com.system.questionnaire.util.JsonResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.jnlp.ServiceManager;
import java.util.List;

@RestController
public class AdminController {
    @Autowired
    UserService userService;
    @Autowired
    SurveyService surveyService;
    @Autowired
    ProblemService problemService;

    //管理员登录
    @ResponseBody
    @RequestMapping(value = "/admin/login", method = RequestMethod.GET)
    public JsonResult login(User user){
        JsonResult js;
        System.out.println(user.getUserPhone());
        System.out.println(user.getUserPassword());
        try{
            User u = userService.selectForlogin(user);
            if(u!=null){
                if(u.getUserAttribute()==1){
                    js = new JsonResult(Constants.STATUS_SUCCESS,"1",u);
                }else{
                    js = new JsonResult(Constants.STATUS_NOT_FOUND,"0");
                }
            }else{
                js = new JsonResult(Constants.STATUS_ERROR,"0");
            }
        }catch (Exception e){
            js = new JsonResult(Constants.STATUS_FAIL,"-1");
        }
        return js;
    }

    //显示所有用户
    @ResponseBody
    @RequestMapping(value = "/user/selectalluser", method = RequestMethod.GET)
    public JsonResult selectalluser(){
        JsonResult js;
        try{
            List<User> list = userService.selectAll();
            js = new JsonResult(Constants.STATUS_SUCCESS,"成功",list);
        }catch (Exception e){
            js = new JsonResult(Constants.STATUS_FAIL,"异常");
        }
        return js;
    }

    //根据用户ID显示用户
    @ResponseBody
    @RequestMapping(value = "/user/select", method = RequestMethod.GET)
    public JsonResult select(User user){
        JsonResult js;
        try{
            if(user.getUserId()!=null){
                User user1 = userService.selectByPrimaryKey(user);
                js = new JsonResult(Constants.STATUS_SUCCESS,"查找成功",user1);
            }else {
                js = new JsonResult(Constants.STATUS_NOT_FOUND,"查找失败");
            }
        }catch (Exception e){
            js = new JsonResult(Constants.STATUS_FAIL,"查找异常");
        }
        return js;
    }

    //删除用户
    @ResponseBody
    @RequestMapping(value = "/user/delete", method = RequestMethod.GET)
    public JsonResult delete(User user){
        JsonResult js;
        try{
            userService.updateByPrimaryKeySelective(user);
            js = new JsonResult(Constants.STATUS_SUCCESS,"删除成功");
        }catch (Exception e){
            js = new JsonResult(Constants.STATUS_FAIL,"删除异常");
        }
        return js;
    }

    //恢复用户
    @ResponseBody
    @RequestMapping(value = "/user/recover", method = RequestMethod.GET)
    public JsonResult recover(User user){
        JsonResult js;
        try{
            userService.updateById(user);
            js = new JsonResult(Constants.STATUS_SUCCESS,"删除成功");
        }catch (Exception e){
            js = new JsonResult(Constants.STATUS_FAIL,"删除异常");
        }
        return js;
    }

    //显示所有问卷
    @ResponseBody
    @RequestMapping(value = "/survey/selectallsurvey", method = RequestMethod.GET)
    public JsonResult selectallsurvey(){
        JsonResult js;
        try{
            List<Survey> list = surveyService.selectAllSurvey();
            js = new JsonResult(Constants.STATUS_SUCCESS,"查询成功",list);
        }catch (Exception e){
            js = new JsonResult(Constants.STATUS_FAIL,"查询异常");
        }
        return js;
    }

    //管理员删除问卷
    @ResponseBody
    @RequestMapping(value = "/survey/deletesur", method = RequestMethod.GET)
    public JsonResult deletesur(Survey survey){
        JsonResult js;
        try{
            surveyService.updateByPrimaryKey(survey);
            js = new JsonResult(Constants.STATUS_SUCCESS,"删除成功");
        }catch (Exception e){
            js = new JsonResult(Constants.STATUS_FAIL,"删除异常");
        }
        return js;
    }


}
