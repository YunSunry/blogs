package com.ncvt.controller;

import com.ncvt.entity.Msg;
import com.ncvt.entity.Users;
import com.ncvt.service.UsersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@Controller
@RestController
@RequestMapping("/u")
public class UsersController {

    @Autowired
    UsersService usersService;


    @ResponseBody
    @RequestMapping("/")
    public Users getHostById(){
        Users users = usersService.queryById(1);
        System.out.println(users);
        return users;
    }


    @ResponseBody
    @RequestMapping("/login")
    public Msg Login(Users users){
        try {
           Users user =usersService.Login(users);
            return Msg.Success(user);
        }catch (Exception e){
            return Msg.Fail(e);
        }
    }



    @ResponseBody
    @RequestMapping("/update")
    public Msg Update(Users users){
        try {
            int user =usersService.update(users);
            return Msg.Success(user);
        }catch (Exception e){
            return Msg.Fail(e);
        }
    }







}
