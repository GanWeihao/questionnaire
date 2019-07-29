package com.system.questionnaire.service;

import com.system.questionnaire.model.Problem;
import com.system.questionnaire.model.Survey;

import java.util.List;

public interface ProblemService {
    //添加问题
    public void insertSelective(Problem problem);
    //根据问卷ID查问题
    public List<Problem> selectBySurveyId(String problemSurveyId);
    //更新选项被选数量
    public void updateOptionsNum(Problem problem);
}
