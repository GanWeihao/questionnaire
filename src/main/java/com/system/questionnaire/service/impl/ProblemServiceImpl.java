package com.system.questionnaire.service.impl;

import com.system.questionnaire.mapper.ProblemMapper;
import com.system.questionnaire.model.Problem;
import com.system.questionnaire.model.Survey;
import com.system.questionnaire.service.ProblemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class ProblemServiceImpl implements ProblemService {
    @Autowired
    ProblemMapper problemMapper;

    //添加问题
    @Override
    public void insertSelective(Problem problem) {
        UUID uuid = UUID.randomUUID();
        String str = uuid.toString();
        String uuidStr = str.replace("-", "");
        problem.setProblemId(uuidStr);
        if(problem.getOptionsOne()!=null){
            problem.setOptionsOneNum(0);
        }
        if(problem.getOptionsThree()!=null){
            problem.setOptionsTwoNum(0);
        }
        if(problem.getOptionsThree()!=null){
            problem.setOptionsThreeNum(0);
        }
        if(problem.getOptionsFour()!=null){
            problem.setOptionsFourNum(0);
        }
        problemMapper.insertSelective(problem);
    }

    //根据问卷ID查问题
    @Override
    public List<Problem> selectBySurveyId(String problemSurveyId) {
        return problemMapper.selectBySurveyId(problemSurveyId);
    }

    @Override
    public void updateOptionsNum(Problem problem) {
        problemMapper.updateOptionsNum(problem);
    }
}
