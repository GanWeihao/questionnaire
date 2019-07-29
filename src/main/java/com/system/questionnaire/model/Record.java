package com.system.questionnaire.model;

import java.util.Date;

public class Record {
    private String recordId;

    private String recordUserId;

    private String recordSurveyId;

    private Date recordTime;

    public Record(String recordId, String recordUserId, String recordSurveyId, Date recordTime) {
        this.recordId = recordId;
        this.recordUserId = recordUserId;
        this.recordSurveyId = recordSurveyId;
        this.recordTime = recordTime;
    }

    public Record() {
        super();
    }

    public String getRecordId() {
        return recordId;
    }

    public void setRecordId(String recordId) {
        this.recordId = recordId == null ? null : recordId.trim();
    }

    public String getRecordUserId() {
        return recordUserId;
    }

    public void setRecordUserId(String recordUserId) {
        this.recordUserId = recordUserId == null ? null : recordUserId.trim();
    }

    public String getRecordSurveyId() {
        return recordSurveyId;
    }

    public void setRecordSurveyId(String recordSurveyId) {
        this.recordSurveyId = recordSurveyId == null ? null : recordSurveyId.trim();
    }

    public Date getRecordTime() {
        return recordTime;
    }

    public void setRecordTime(Date recordTime) {
        this.recordTime = recordTime;
    }
}