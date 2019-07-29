package com.system.questionnaire.model;

import java.util.Date;

public class User {
    private String userId;

    private String userName;

    private String userPassword;

    private String userGrade;

    private String userSex;

    private String userPhone;

    private String userEmail;

    private Date userTime;

    private Integer userAttribute;

    private Integer userStatus;

    public User(String userId, String userName, String userPassword, String userGrade, String userSex, String userPhone, String userEmail, Date userTime, Integer userAttribute, Integer userStatus) {
        this.userId = userId;
        this.userName = userName;
        this.userPassword = userPassword;
        this.userGrade = userGrade;
        this.userSex = userSex;
        this.userPhone = userPhone;
        this.userEmail = userEmail;
        this.userTime = userTime;
        this.userAttribute = userAttribute;
        this.userStatus = userStatus;
    }

    public User() {
        super();
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId == null ? null : userId.trim();
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName == null ? null : userName.trim();
    }

    public String getUserPassword() {
        return userPassword;
    }

    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword == null ? null : userPassword.trim();
    }

    public String getUserGrade() {
        return userGrade;
    }

    public void setUserGrade(String userGrade) {
        this.userGrade = userGrade;
    }

    public String getUserSex() {
        return userSex;
    }

    public void setUserSex(String userSex) {
        this.userSex = userSex;
    }

    public String getUserPhone() {
        return userPhone;
    }

    public void setUserPhone(String userPhone) {
        this.userPhone = userPhone == null ? null : userPhone.trim();
    }

    public String getUserEmail() {
        return userEmail;
    }

    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail == null ? null : userEmail.trim();
    }

    public Date getUserTime() {
        return userTime;
    }

    public void setUserTime(Date userTime) {
        this.userTime = userTime;
    }

    public Integer getUserAttribute() {
        return userAttribute;
    }

    public void setUserAttribute(Integer userAttribute) {
        this.userAttribute = userAttribute;
    }

    public Integer getUserStatus() {
        return userStatus;
    }

    public void setUserStatus(Integer userStatus) {
        this.userStatus = userStatus;
    }
}