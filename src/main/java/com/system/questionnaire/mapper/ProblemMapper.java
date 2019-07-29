package com.system.questionnaire.mapper;

import com.system.questionnaire.model.Problem;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

import java.util.List;

@Mapper
@Component("ProblemMapper")
public interface ProblemMapper {
    void updateOptionsNum(Problem problem);

    List<Problem> selectBySurveyId(String problemSurveyId);

    int deleteByPrimaryKey(String problemId);

    int insert(Problem record);

    void insertSelective(Problem record);

    Problem selectByPrimaryKey(String problemId);

    int updateByPrimaryKeySelective(Problem record);

    int updateByPrimaryKey(Problem record);
}