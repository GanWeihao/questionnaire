package com.system.questionnaire.model;

public class Problem {
    private String problemId;

    private String problemSurveyId;

    private String problemContent;

    private String optionsOne;

    private String optionsTwo;

    private String optionsThree;

    private String optionsFour;

    private Integer optionsOneNum;

    private Integer optionsTwoNum;

    private Integer optionsThreeNum;

    private Integer optionsFourNum;

    public Problem(String problemId, String problemSurveyId, String problemContent, String optionsOne, String optionsTwo, String optionsThree, String optionsFour, Integer optionsOneNum, Integer optionsTwoNum, Integer optionsThreeNum, Integer optionsFourNum) {
        this.problemId = problemId;
        this.problemSurveyId = problemSurveyId;
        this.problemContent = problemContent;
        this.optionsOne = optionsOne;
        this.optionsTwo = optionsTwo;
        this.optionsThree = optionsThree;
        this.optionsFour = optionsFour;
        this.optionsOneNum = optionsOneNum;
        this.optionsTwoNum = optionsTwoNum;
        this.optionsThreeNum = optionsThreeNum;
        this.optionsFourNum = optionsFourNum;
    }

    public Problem() {
        super();
    }

    public String getProblemId() {
        return problemId;
    }

    public void setProblemId(String problemId) {
        this.problemId = problemId == null ? null : problemId.trim();
    }

    public String getProblemSurveyId() {
        return problemSurveyId;
    }

    public void setProblemSurveyId(String problemSurveyId) {
        this.problemSurveyId = problemSurveyId == null ? null : problemSurveyId.trim();
    }

    public String getProblemContent() {
        return problemContent;
    }

    public void setProblemContent(String problemContent) {
        this.problemContent = problemContent == null ? null : problemContent.trim();
    }

    public String getOptionsOne() {
        return optionsOne;
    }

    public void setOptionsOne(String optionsOne) {
        this.optionsOne = optionsOne == null ? null : optionsOne.trim();
    }

    public String getOptionsTwo() {
        return optionsTwo;
    }

    public void setOptionsTwo(String optionsTwo) {
        this.optionsTwo = optionsTwo == null ? null : optionsTwo.trim();
    }

    public String getOptionsThree() {
        return optionsThree;
    }

    public void setOptionsThree(String optionsThree) {
        this.optionsThree = optionsThree == null ? null : optionsThree.trim();
    }

    public String getOptionsFour() {
        return optionsFour;
    }

    public void setOptionsFour(String optionsFour) {
        this.optionsFour = optionsFour == null ? null : optionsFour.trim();
    }

    public Integer getOptionsOneNum() {
        return optionsOneNum;
    }

    public void setOptionsOneNum(Integer optionsOneNum) {
        this.optionsOneNum = optionsOneNum;
    }

    public Integer getOptionsTwoNum() {
        return optionsTwoNum;
    }

    public void setOptionsTwoNum(Integer optionsTwoNum) {
        this.optionsTwoNum = optionsTwoNum;
    }

    public Integer getOptionsThreeNum() {
        return optionsThreeNum;
    }

    public void setOptionsThreeNum(Integer optionsThreeNum) {
        this.optionsThreeNum = optionsThreeNum;
    }

    public Integer getOptionsFourNum() {
        return optionsFourNum;
    }

    public void setOptionsFourNum(Integer optionsFourNum) {
        this.optionsFourNum = optionsFourNum;
    }
}