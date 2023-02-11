package com.ncvt.controller;

import com.ncvt.entity.At;
import com.ncvt.entity.Msg;
import com.ncvt.service.AtService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/at")
public class AtController {

    @Autowired
    AtService atService;

    //关注
    @RequestMapping("/addAt")
    public Msg addAt(At at){
        try {
            int num = atService.insert(at);
            return Msg.Success(num);
        }catch (Exception e){
            return Msg.Fail(e);
        }
    }

    @RequestMapping("/findByAtId")
    public Msg findId(int usersId){
        try {
          List<At> list = atService.findAtById(usersId);
            return Msg.Success(list);
        }catch (Exception e){
            return Msg.Fail(e);
        }
    }

    @RequestMapping("/getAllSize")
    public Msg atCount(int usersId){
        try {
            int count = atService.count(usersId);
            return Msg.Success(count);
        }catch (Exception e){
            return Msg.Fail(e);
        }
    }

    @RequestMapping("/deleteById")
    public Msg delAt(int atId){
        try {
            int i = atService.deleteById(atId);
            return Msg.Success(i);
        }catch (Exception e){
            return Msg.Fail(e);
        }
    }

}
