package com.ncvt.controller;

import com.ncvt.entity.Comments;
import com.ncvt.entity.Msg;
import com.ncvt.service.CommentsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@CrossOrigin
@Controller
@RequestMapping("/comments")
public class CommentsController {

    @Autowired
    CommentsService commentsService;

    @ResponseBody
    @RequestMapping("/findById")
    public Msg findById(int hostId){
        try {
            List<Comments> comments = commentsService.queryById(hostId);
            return Msg.Success(comments);
        }catch (Exception e){
            return Msg.Fail(e);
        }
    }

    @ResponseBody
    @RequestMapping("/addComments")
    public Msg add(Comments comments){
        try {
            int insert = commentsService.insert(comments);
            return Msg.Success(insert);
        }catch (Exception e){
            return Msg.Fail(e);
        }
    }


    @ResponseBody
    @RequestMapping("/getAllSize")
    public Msg allSize(int hostId){
        try {
            int count = commentsService.count(hostId);
            return Msg.Success(count);
        }catch (Exception e){
            return Msg.Fail(e);
        }
    }







}
