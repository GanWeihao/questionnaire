package com.system.questionnaire.mapper;

import com.system.questionnaire.model.Record;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

import java.util.List;

@Mapper
@Component("RecordMapper")
public interface RecordMapper {
    //参与问卷调查
    void insertSelective(Record record);
    //用户查看参与的问卷
    List<Record> selectByUserId(Record record);

    int deleteByPrimaryKey(String recordId);

    int insert(Record record);

    Record selectByPrimaryKey(String recordId);

    int updateByPrimaryKeySelective(Record record);

    int updateByPrimaryKey(Record record);
}