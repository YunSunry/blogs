package com.ncvt.test;

import com.ncvt.entity.At;
import com.ncvt.entity.Comments;
import com.ncvt.service.AtService;
import com.ncvt.service.CommentsService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.Date;
import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:applicationContext_mapper.xml",
        "classpath:applicationContext_service.xml"})
public class CommentTest {

    @Autowired
    CommentsService commentsService;



    @Test
    public void findById(){
        List<Comments> comments = commentsService.queryById(2);
        System.out.print(comments);

    }

    @Test
    public void AddComments(){
        Comments comments = new Comments();

        comments.setCommentsText("评论评论");
        comments.setCreateTime("2022/11/30");
        int insert = commentsService.insert(comments);
        if (insert>0){
            System.out.print("发表评论成功");
        }else {
            System.out.println("暂无发表成功");
        }

    }

    /**
     * 关注人的添加
     */






}
