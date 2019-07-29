package com.system.questionnaire.service;

import com.system.questionnaire.model.Record;

import java.util.List;

public interface RecordService {
    public void insertSelective(Record record);

    public List<Record> selectByUserId(Record record);
}
