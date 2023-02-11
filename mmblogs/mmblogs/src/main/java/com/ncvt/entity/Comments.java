package com.ncvt.entity;

import java.util.Date;
import java.io.Serializable;

/**
 * (Comments)实体类
 *
 * @author makejava
 * @since 2022-11-30 21:31:25
 */
public class Comments implements Serializable {
    private static final long serialVersionUID = 469313127403118380L;
    
    private Integer commentsId;
    
    private String commentsText;
    
    private Integer commentsLike;
    
    private Integer commentsSharing;
    
    private Integer commentsCom;
    
    private String createTime;
    
    private String commentsAvg;
    
    private String commentsNickname;
    
    private Integer hostId;


    public Integer getCommentsId() {
        return commentsId;
    }

    public void setCommentsId(Integer commentsId) {
        this.commentsId = commentsId;
    }

    public String getCommentsText() {
        return commentsText;
    }

    public void setCommentsText(String commentsText) {
        this.commentsText = commentsText;
    }

    public Integer getCommentsLike() {
        return commentsLike;
    }

    public void setCommentsLike(Integer commentsLike) {
        this.commentsLike = commentsLike;
    }

    public Integer getCommentsSharing() {
        return commentsSharing;
    }

    public void setCommentsSharing(Integer commentsSharing) {
        this.commentsSharing = commentsSharing;
    }

    public Integer getCommentsCom() {
        return commentsCom;
    }

    public void setCommentsCom(Integer commentsCom) {
        this.commentsCom = commentsCom;
    }

    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    public String getCommentsAvg() {
        return commentsAvg;
    }

    public void setCommentsAvg(String commentsAvg) {
        this.commentsAvg = commentsAvg;
    }

    public String getCommentsNickname() {
        return commentsNickname;
    }

    public void setCommentsNickname(String commentsNickname) {
        this.commentsNickname = commentsNickname;
    }

    public Integer getHostId() {
        return hostId;
    }

    public void setHostId(Integer hostId) {
        this.hostId = hostId;
    }

}

