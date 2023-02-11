package com.ncvt.entity;

import java.util.Date;
import java.io.Serializable;

/**
 * (Blog)实体类
 *
 * @author makejava
 * @since 2022-11-11 12:33:53
 */
public class Blog implements Serializable {
    private static final long serialVersionUID = 595184580939639916L;
    
    private Integer blogId;
    
    private String blogText;
    
    private String blogCreateTime;
    
    private String blogPic;
    
    private Integer blogSharing;
    
    private String blogComment;
    
    private Integer blogLike;
    
    private String blogRegion;

    private int userId;

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public Integer getBlogId() {
        return blogId;
    }

    public void setBlogId(Integer blogId) {
        this.blogId = blogId;
    }

    public String getBlogText() {
        return blogText;
    }

    public void setBlogText(String blogText) {
        this.blogText = blogText;
    }

    public String getBlogCreateTime() {
        return blogCreateTime;
    }

    public void setBlogCreateTime(String blogCreateTime) {
        this.blogCreateTime = blogCreateTime;
    }

    public String getBlogPic() {
        return blogPic;
    }

    public void setBlogPic(String blogPic) {
        this.blogPic = blogPic;
    }

    public Integer getBlogSharing() {
        return blogSharing;
    }

    public void setBlogSharing(Integer blogSharing) {
        this.blogSharing = blogSharing;
    }

    public String getBlogComment() {
        return blogComment;
    }

    public void setBlogComment(String blogComment) {
        this.blogComment = blogComment;
    }

    public Integer getBlogLike() {
        return blogLike;
    }

    public void setBlogLike(Integer blogLike) {
        this.blogLike = blogLike;
    }

    public String getBlogRegion() {
        return blogRegion;
    }

    public void setBlogRegion(String blogRegion) {
        this.blogRegion = blogRegion;
    }

    @Override
    public String toString() {
        return "Blog{" +
                "blogId=" + blogId +
                ", blogText='" + blogText + '\'' +
                ", blogCreateTime='" + blogCreateTime + '\'' +
                ", blogPic='" + blogPic + '\'' +
                ", blogSharing=" + blogSharing +
                ", blogComment='" + blogComment + '\'' +
                ", blogLike=" + blogLike +
                ", blogRegion='" + blogRegion + '\'' +
                ", userId=" + userId +
                '}';
    }
}

