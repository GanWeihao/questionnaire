package com.system.questionnaire.mapper;

import com.system.questionnaire.model.Survey;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

import java.util.List;

@Mapper
@Component("SurveyMapper")
public interface SurveyMapper {
    //根据用户ID查所有问卷
    List<Survey> selectByUserId(Survey survey);

    //显示所有问卷
    List<Survey> selectAllSurvey();

   //发布调查问卷
    void insertSelective(Survey record);

    //修改问卷状态
    void updateByPrimaryKeySelective(Survey record);

    int deleteByPrimaryKey(String surveyId);

    int insert(Survey record);

    //查询根据问卷ID问卷信息
    Survey selectByPrimaryKey(String surveyId);


    int updateByPrimaryKey(Survey record);
}