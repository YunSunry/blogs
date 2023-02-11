package com.ncvt.controller;

import com.ncvt.entity.Host;
import com.ncvt.entity.Msg;
import com.ncvt.service.CommentsService;
import com.ncvt.service.HostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * (Host)表控制层
 *
 * @author makejava
 * @since 2022-10-29 09:37:42
 */
@Controller
@RestController
@RequestMapping("/host")
public class HostController {

    @Autowired
    HostService hostService;



//分页查询
    @RequestMapping("/list")
    @ResponseBody
    public Msg getTest(){
        try {

            List<Host> list = hostService.getHostByPage();
            return Msg.Success(list);
        }catch (Exception e){
            return Msg.Fail(e);
        }
    }

    @RequestMapping("/findByHostId")
    @ResponseBody
    public Msg findByHostId(int hostId){
        try {
            Host list = hostService.findById(hostId);
            return Msg.Success(list);
        }catch (Exception e){
            return Msg.Fail(e);
        }
    }

    @RequestMapping("/update")
    @ResponseBody
    public Msg UpdateHost(Host host){
        try {
            int num = hostService.update(host);
            return Msg.Success(num);
        }catch (Exception e){
            return Msg.Fail(e);
        }
    }

    @RequestMapping("/insert")
    @ResponseBody
    public Msg InsertHost(Host host){
        try {
            int num = hostService.insert(host);
            return Msg.Success(num);
        }catch (Exception e){
            return Msg.Fail(e);
        }
    }






}

