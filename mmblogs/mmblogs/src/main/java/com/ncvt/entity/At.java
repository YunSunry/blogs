package com.ncvt.entity;

import java.io.Serializable;

/**
 * (At)实体类
 *
 * @author makejava
 * @since 2022-11-30 13:42:01
 */
public class At implements Serializable {
    private static final long serialVersionUID = 293354826010733366L;
    
    private Integer atId;
    
    private Integer userId;
    
    private String atAvg;
    
    private String atNickname;
    
    private String atDes;


    public Integer getAtId() {
        return atId;
    }

    public void setAtId(Integer atId) {
        this.atId = atId;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getAtAvg() {
        return atAvg;
    }

    public void setAtAvg(String atAvg) {
        this.atAvg = atAvg;
    }

    public String getAtNickname() {
        return atNickname;
    }

    public void setAtNickname(String atNickname) {
        this.atNickname = atNickname;
    }

    public String getAtDes() {
        return atDes;
    }

    public void setAtDes(String atDes) {
        this.atDes = atDes;
    }

}

