package com.ncvt.entity;

import java.util.Date;
import java.io.Serializable;

/**
 * (Users)实体类
 *
 * @author makejava
 * @since 2022-11-30 21:57:37
 */
public class Users implements Serializable {
    private static final long serialVersionUID = 789625977660086426L;
    
    private Integer usersId;
    
    private String usersAccount;
    
    private String usersPassword;
    
    private String usersAvg;
    
    private String usersNickname;
    
    private String usersDes;
    
    private String usersGender;
    
    private String usersSignupTime;
    
    private Object usersFans;
    
    private String usersAttention;
    
    private String usersLocation;
    
    private String usersSchool;
    
    private String usersHometown;


    public Integer getUsersId() {
        return usersId;
    }

    public void setUsersId(Integer usersId) {
        this.usersId = usersId;
    }

    public String getUsersAccount() {
        return usersAccount;
    }

    public void setUsersAccount(String usersAccount) {
        this.usersAccount = usersAccount;
    }

    public String getUsersPassword() {
        return usersPassword;
    }

    public void setUsersPassword(String usersPassword) {
        this.usersPassword = usersPassword;
    }

    public String getUsersAvg() {
        return usersAvg;
    }

    public void setUsersAvg(String usersAvg) {
        this.usersAvg = usersAvg;
    }

    public String getUsersNickname() {
        return usersNickname;
    }

    public void setUsersNickname(String usersNickname) {
        this.usersNickname = usersNickname;
    }

    public String getUsersDes() {
        return usersDes;
    }

    public void setUsersDes(String usersDes) {
        this.usersDes = usersDes;
    }

    public String getUsersGender() {
        return usersGender;
    }

    public void setUsersGender(String usersGender) {
        this.usersGender = usersGender;
    }

    public String getUsersSignupTime() {
        return usersSignupTime;
    }

    public void setUsersSignupTime(String usersSignupTime) {
        this.usersSignupTime = usersSignupTime;
    }

    public Object getUsersFans() {
        return usersFans;
    }

    public void setUsersFans(Object usersFans) {
        this.usersFans = usersFans;
    }

    public String getUsersAttention() {
        return usersAttention;
    }

    public void setUsersAttention(String usersAttention) {
        this.usersAttention = usersAttention;
    }

    public String getUsersLocation() {
        return usersLocation;
    }

    public void setUsersLocation(String usersLocation) {
        this.usersLocation = usersLocation;
    }

    public String getUsersSchool() {
        return usersSchool;
    }

    public void setUsersSchool(String usersSchool) {
        this.usersSchool = usersSchool;
    }

    public String getUsersHometown() {
        return usersHometown;
    }

    public void setUsersHometown(String usersHometown) {
        this.usersHometown = usersHometown;
    }

}

