package com.system.questionnaire.model;

import java.util.Date;

public class Survey {
    private String surveyId;

    private String surveyUserId;

    private String surveyTitle;

    private String surveyContent;

    private Date surveyTime;

    private Integer surveyStatus;

    public Survey(String surveyId, String surveyUserId, String surveyTitle, String surveyContent, Date surveyTime, Integer surveyStatus) {
        this.surveyId = surveyId;
        this.surveyUserId = surveyUserId;
        this.surveyTitle = surveyTitle;
        this.surveyContent = surveyContent;
        this.surveyTime = surveyTime;
        this.surveyStatus = surveyStatus;
    }

    public Survey() {
        super();
    }

    public String getSurveyId() {
        return surveyId;
    }

    public void setSurveyId(String surveyId) {
        this.surveyId = surveyId == null ? null : surveyId.trim();
    }

    public String getSurveyUserId() {
        return surveyUserId;
    }

    public void setSurveyUserId(String surveyUserId) {
        this.surveyUserId = surveyUserId == null ? null : surveyUserId.trim();
    }

    public String getSurveyTitle() {
        return surveyTitle;
    }

    public void setSurveyTitle(String surveyTitle) {
        this.surveyTitle = surveyTitle == null ? null : surveyTitle.trim();
    }

    public String getSurveyContent() {
        return surveyContent;
    }

    public void setSurveyContent(String surveyContent) {
        this.surveyContent = surveyContent == null ? null : surveyContent.trim();
    }

    public Date getSurveyTime() {
        return surveyTime;
    }

    public void setSurveyTime(Date surveyTime) {
        this.surveyTime = surveyTime;
    }

    public Integer getSurveyStatus() {
        return surveyStatus;
    }

    public void setSurveyStatus(Integer surveyStatus) {
        this.surveyStatus = surveyStatus;
    }
}