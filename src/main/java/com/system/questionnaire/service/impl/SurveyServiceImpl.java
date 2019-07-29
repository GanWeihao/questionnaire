package com.system.questionnaire.service.impl;

import com.system.questionnaire.mapper.SurveyMapper;
import com.system.questionnaire.model.Survey;
import com.system.questionnaire.service.SurveyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;
import java.util.UUID;

@Service
public class SurveyServiceImpl implements SurveyService {
    @Autowired
    SurveyMapper surveyMapper;

    //发布调查问卷
    @Override
    public void insertSelective(Survey survey) {
        Date date = new Date();
        String millis = String.valueOf(date.getTime());
        survey.setSurveyId(millis);
        survey.setSurveyStatus(0);
        surveyMapper.insertSelective(survey);
    }

    //根据问卷ID查询问卷信息
    @Override
    public Survey selectByPrimaryKey(String surveyId) {
        return surveyMapper.selectByPrimaryKey(surveyId);
    }

    @Override
    public List<Survey> selectAllSurvey() {
        return surveyMapper.selectAllSurvey();
    }

    //根据用户ID查找所有问卷
    @Override
    public List<Survey> selectByUserId(Survey survey) {
        return surveyMapper.selectByUserId(survey);
    }

    //问卷截止，状态改为1
    @Override
    public void updateByPrimaryKeySelective(Survey survey) {
        survey.setSurveyStatus(1);
        surveyMapper.updateByPrimaryKeySelective(survey);
    }

    //删除问卷，状态改为2
    @Override
    public void updateByPrimaryKey(Survey survey) {
        survey.setSurveyStatus(2);
        surveyMapper.updateByPrimaryKeySelective(survey);
    }

}
