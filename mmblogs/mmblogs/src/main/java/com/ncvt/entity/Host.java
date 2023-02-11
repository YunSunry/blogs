package com.ncvt.entity;

import java.util.Date;
import java.io.Serializable;

/**
 * (Host)实体类
 *
 * @author makejava
 * @since 2022-10-29 09:37:43
 */
public class Host implements Serializable {
    private static final long serialVersionUID = 566323669457738334L;

    private Integer hostId;

    private String hostTitle;

    private String hostTitleHttp;

    private String hostTu;

    private String hostTime;

    private String hoatFrom;

    private String hostWeiboText;

    private String hostWeiboTextHttp;

    private String hostSurltext;

    private String hostWeiboTextHttp1;

    private String hostTu2;

    private String hostWeiboText3;

    private String hostTu4;

    private String hostMboxcol;

    private String hostTime5;

    private String hostMdiybtn;

    private String hostMdiybtn6;

    private String hostMdiybtn7;

    private String hostTopic;

    private String host2;

    private String type;


    public Integer getHostId() {
        return hostId;
    }

    public void setHostId(Integer hostId) {
        this.hostId = hostId;
    }

    public String getHostTitle() {
        return hostTitle;
    }

    public void setHostTitle(String hostTitle) {
        this.hostTitle = hostTitle;
    }

    public String getHostTitleHttp() {
        return hostTitleHttp;
    }

    public void setHostTitleHttp(String hostTitleHttp) {
        this.hostTitleHttp = hostTitleHttp;
    }

    public String getHostTu() {
        return hostTu;
    }

    public void setHostTu(String hostTu) {
        this.hostTu = hostTu;
    }

    public String getHostTime() {
        return hostTime;
    }

    public void setHostTime(String hostTime) {
        this.hostTime = hostTime;
    }

    public String getHoatFrom() {
        return hoatFrom;
    }

    public void setHoatFrom(String hoatFrom) {
        this.hoatFrom = hoatFrom;
    }

    public String getHostWeiboText() {
        return hostWeiboText;
    }

    public void setHostWeiboText(String hostWeiboText) {
        this.hostWeiboText = hostWeiboText;
    }

    public String getHostWeiboTextHttp() {
        return hostWeiboTextHttp;
    }

    public void setHostWeiboTextHttp(String hostWeiboTextHttp) {
        this.hostWeiboTextHttp = hostWeiboTextHttp;
    }

    public String getHostSurltext() {
        return hostSurltext;
    }

    public void setHostSurltext(String hostSurltext) {
        this.hostSurltext = hostSurltext;
    }

    public String getHostWeiboTextHttp1() {
        return hostWeiboTextHttp1;
    }

    public void setHostWeiboTextHttp1(String hostWeiboTextHttp1) {
        this.hostWeiboTextHttp1 = hostWeiboTextHttp1;
    }

    public String getHostTu2() {
        return hostTu2;
    }

    public void setHostTu2(String hostTu2) {
        this.hostTu2 = hostTu2;
    }

    public String getHostWeiboText3() {
        return hostWeiboText3;
    }

    public void setHostWeiboText3(String hostWeiboText3) {
        this.hostWeiboText3 = hostWeiboText3;
    }

    public String getHostTu4() {
        return hostTu4;
    }

    public void setHostTu4(String hostTu4) {
        this.hostTu4 = hostTu4;
    }

    public String getHostMboxcol() {
        return hostMboxcol;
    }

    public void setHostMboxcol(String hostMboxcol) {
        this.hostMboxcol = hostMboxcol;
    }

    public String getHostTime5() {
        return hostTime5;
    }

    public void setHostTime5(String hostTime5) {
        this.hostTime5 = hostTime5;
    }

    public String getHostMdiybtn() {
        return hostMdiybtn;
    }

    public void setHostMdiybtn(String hostMdiybtn) {
        this.hostMdiybtn = hostMdiybtn;
    }

    public String getHostMdiybtn6() {
        return hostMdiybtn6;
    }

    public void setHostMdiybtn6(String hostMdiybtn6) {
        this.hostMdiybtn6 = hostMdiybtn6;
    }

    public String getHostMdiybtn7() {
        return hostMdiybtn7;
    }

    public void setHostMdiybtn7(String hostMdiybtn7) {
        this.hostMdiybtn7 = hostMdiybtn7;
    }

    public String getHostTopic() {
        return hostTopic;
    }

    public void setHostTopic(String hostTopic) {
        this.hostTopic = hostTopic;
    }

    public String getHost2() {
        return host2;
    }

    public void setHost2(String host2) {
        this.host2 = host2;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Host{" +
                "hostId=" + hostId +
                ", hostTitle='" + hostTitle + '\'' +
                ", hostTitleHttp='" + hostTitleHttp + '\'' +
                ", hostTu='" + hostTu + '\'' +
                ", hostTime=" + hostTime +
                ", hoatFrom='" + hoatFrom + '\'' +
                ", hostWeiboText='" + hostWeiboText + '\'' +
                ", hostWeiboTextHttp='" + hostWeiboTextHttp + '\'' +
                ", hostSurltext='" + hostSurltext + '\'' +
                ", hostWeiboTextHttp1='" + hostWeiboTextHttp1 + '\'' +
                ", hostTu2='" + hostTu2 + '\'' +
                ", hostWeiboText3='" + hostWeiboText3 + '\'' +
                ", hostTu4='" + hostTu4 + '\'' +
                ", hostMboxcol='" + hostMboxcol + '\'' +
                ", hostTime5=" + hostTime5 +
                ", hostMdiybtn='" + hostMdiybtn + '\'' +
                ", hostMdiybtn6='" + hostMdiybtn6 + '\'' +
                ", hostMdiybtn7='" + hostMdiybtn7 + '\'' +
                ", hostTopic='" + hostTopic + '\'' +
                ", host2='" + host2 + '\'' +
                ", type='" + type + '\'' +
                '}';
    }
}

