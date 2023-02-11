package com.ncvt.test;

import com.ncvt.entity.At;
import com.ncvt.service.AtService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:applicationContext_mapper.xml",
        "classpath:applicationContext_service.xml"})
public class AtTest {

    @Autowired
    AtService atService;

    @Test
    public void addAt(){
        At at = new At();
        at.setAtNickname("思念人周周");
        at.setAtDes("www");
        at.setUserId(1);
        atService.insert(at);
    }

    @Test
    public void getAllSize(){
        int count = atService.count(1);
        System.out.println(count);
    }




}
