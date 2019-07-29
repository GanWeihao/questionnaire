package com.system.questionnaire.service;


import com.system.questionnaire.model.Survey;

import java.util.List;

public interface SurveyService {
    public void insertSelective(Survey survey);

    public List<Survey> selectByUserId(Survey survey);

    public void updateByPrimaryKeySelective(Survey survey);

    public void updateByPrimaryKey(Survey survey);

    public Survey selectByPrimaryKey(String surveyId);

    public List<Survey> selectAllSurvey();
}
