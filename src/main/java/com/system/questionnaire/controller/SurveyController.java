package com.system.questionnaire.controller;

import com.system.questionnaire.model.Survey;
import com.system.questionnaire.service.SurveyService;
import com.system.questionnaire.util.Constants;
import com.system.questionnaire.util.JsonResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class SurveyController {
    @Autowired
    SurveyService surveyService;

    //发布调查问卷
    @ResponseBody
    @RequestMapping(value = "/survey/insert", method = RequestMethod.GET)
    public JsonResult insert(Survey survey){
        JsonResult js;
        try{
            surveyService.insertSelective(survey);
            System.out.println(survey.getSurveyId());
            Survey survey1 = surveyService.selectByPrimaryKey(survey.getSurveyId());
            js = new JsonResult(Constants.STATUS_SUCCESS,"1",survey1);
        }catch (Exception e){
            js = new JsonResult(Constants.STATUS_FAIL,"0");
        }
        return js;
    }

    //根据用户ID查所有问卷
    @ResponseBody
    @RequestMapping(value = "/survey/selectall", method = RequestMethod.GET)
    public JsonResult selectall(Survey survey){
        JsonResult js;
        try{
            List list = surveyService.selectByUserId(survey);
            System.out.println(survey.getSurveyUserId());
            js = new JsonResult(Constants.STATUS_SUCCESS,"查找成功",list);
        }catch (Exception e){
            js = new JsonResult(Constants.STATUS_FAIL,"查找异常");
        }
        return js;
    }

    //问卷结束
    @ResponseBody
    @RequestMapping(value = "/survey/stop",method = RequestMethod.GET)
    public JsonResult stop(Survey survey){
        JsonResult js;
        try{
            surveyService.updateByPrimaryKeySelective(survey);
            js = new JsonResult(Constants.STATUS_SUCCESS,"结束成功");
        }catch (Exception e){
            js = new JsonResult(Constants.STATUS_FAIL,"结束异常");
        }
        return js;
    }

    //查询问卷
    @ResponseBody
    @RequestMapping(value = "/survey/select",method = RequestMethod.GET)
    public JsonResult select(Survey survey){
        JsonResult js;
        try{
            Survey sur = surveyService.selectByPrimaryKey(survey.getSurveyId());
            if(sur!=null){
                js = new JsonResult(Constants.STATUS_SUCCESS,"1",sur);
            }else{
                js = new JsonResult(Constants.STATUS_SUCCESS,"0");
            }
        }catch (Exception e){
            js = new JsonResult(Constants.STATUS_FAIL,"-1");
        }
        return js;
    }
}
