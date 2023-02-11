package com.ncvt.controller;

import com.ncvt.entity.Blog;
import com.ncvt.entity.Host;
import com.ncvt.entity.Msg;
import com.ncvt.service.BlogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/blog")
public class BlogController {
    @Autowired
    BlogService blogService;

    //查询用户的发表微博
    @RequestMapping("/list")
//    @CrossOrigin(allowCredentials = "true",allowedHeaders = "*")
    @ResponseBody
    public Msg getTest(int userId){
        try {
            List<Blog> list = blogService.findAll(userId);
            return Msg.Success(list);
        }catch (Exception e){
            return Msg.Fail(e);
        }
    }

    //根据id删除blog
    @RequestMapping("/delete")
    @ResponseBody
    public Msg delete(int blogId){
        try {
           int num = blogService.deleteById(blogId);
           if(num>0){
               System.out.printf("删除成功");
           }else
           {
               System.out.printf("删除有误，无法进行删除");
           }
            return Msg.Success(num);
        }catch (Exception e){
            return Msg.Fail(e);
        }
    }

    //添加blog
    @RequestMapping("/insert")
    @ResponseBody
    public Msg insert(Blog blog){
        try {
            int num = blogService.insert(blog);
            return Msg.Success(num);
        }catch (Exception e){
            return Msg.Fail(e);
        }
    }

    //修改blog数据
    //添加blog
    @ResponseBody
    @RequestMapping("/update")

    public Msg update(Blog blog){
        try {
            int num = blogService.update(blog);
            return Msg.Success(num);
        }catch (Exception e){
            return Msg.Fail(e);
        }
    }

    //根据id查询数据
    @RequestMapping("/findById")
    @ResponseBody
    public Msg findById(int blogId){
        try {
            Blog byId = blogService.findById(blogId);
            return Msg.Success(byId);
        }catch (Exception e){
            return Msg.Fail(e);
        }
    }


    



}
