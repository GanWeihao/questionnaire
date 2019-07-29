package com.system.questionnaire.service.impl;

import com.system.questionnaire.mapper.RecordMapper;
import com.system.questionnaire.model.Record;
import com.system.questionnaire.service.RecordService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;
import java.util.UUID;

@Service
public class RecordServiceImpl implements RecordService {
    @Autowired
    RecordMapper recordMapper;

    //用户参与调查问卷
    @Override
    public void insertSelective(Record record) {
        UUID uuid = UUID.randomUUID();
        String str = uuid.toString();
        String uuidStr = str.replace("-", "");
        record.setRecordId(uuidStr);
        recordMapper.insertSelective(record);
    }

    //用户参与的调查卷
    @Override
    public List<Record> selectByUserId(Record record) {
        return recordMapper.selectByUserId(record);
    }
}
