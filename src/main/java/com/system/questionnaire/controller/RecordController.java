package com.system.questionnaire.controller;

import com.system.questionnaire.model.Record;
import com.system.questionnaire.model.Survey;
import com.system.questionnaire.service.RecordService;
import com.system.questionnaire.service.SurveyService;
import com.system.questionnaire.util.Constants;
import com.system.questionnaire.util.JsonResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;


@RestController
public class RecordController {
    @Autowired
    RecordService recordService;
    @Autowired
    SurveyService surveyService;

    //用户参与问卷调查
    @ResponseBody
    @RequestMapping(value = "/record/insert",method = RequestMethod.GET)
    public JsonResult insert(Record record){
        JsonResult js;
        try{
            recordService.insertSelective(record);
            js = new JsonResult(Constants.STATUS_SUCCESS,"感谢参与");
        }catch (Exception e){
            js = new JsonResult(Constants.STATUS_FAIL,"参与异常");
        }
        return js;
    }

    //显示用户参与的问卷调查
    @ResponseBody
    @RequestMapping(value = "/record/selectall", method = RequestMethod.GET)
    public JsonResult selectall(Record record){
        JsonResult js;
        try{
            List<Record> list = recordService.selectByUserId(record);
            List list1 = new ArrayList<Survey>();
            for(Record r : list){
                System.out.println(r.getRecordSurveyId());
                Survey survey = surveyService.selectByPrimaryKey(r.getRecordSurveyId());
                list1.add(survey);
            }
            js = new JsonResult(Constants.STATUS_SUCCESS,"查询成功",list1);
        }catch (Exception e){
            js = new JsonResult(Constants.STATUS_FAIL,"查询异常"+e.getMessage());
        }
        return js;
    }
}
