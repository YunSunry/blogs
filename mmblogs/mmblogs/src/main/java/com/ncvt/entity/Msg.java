package com.ncvt.entity;

import javax.xml.transform.Result;
import java.util.Map;

public class Msg {
    private String code;
    private String msg;
    private Object data;

    public static Msg Success(Object data){
        Msg msg = new Msg();
        msg.setCode("200");
        msg.setMsg("success");
        msg.setData(data);
        return msg;
    }


    public static Msg Fail(Exception e){
        Msg msg = new Msg();
        msg.setCode("403");
        msg.setMsg("获取数据失败");
        msg.setData(e);
        return msg;
    }


    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }
}
