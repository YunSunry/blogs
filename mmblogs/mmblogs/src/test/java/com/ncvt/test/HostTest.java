package com.ncvt.test;

import com.ncvt.entity.Host;
import com.ncvt.service.HostService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

/**
 * 项目测试
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:applicationContext_mapper.xml",
        "classpath:applicationContext_service.xml"})
public class HostTest {
    @Autowired
    HostService hostService;



    //分页查询
    @Test
    public void getHostByPage(){
        List<Host> list = hostService.getHostByPage();
        list.forEach(host -> System.out.println(host));
    }

    @Test
    public void getHostId(){
        Host list  = hostService.findById(1);
        System.out.println(list);

    }


    //添加
    @Test
    public void insertHost(){
        Host host = new Host();
        host.setHostWeiboText("正在发表最新的动态");
        host.setHostTitle("时光读物");
        int userInsert = hostService.insert(host);
        System.out.println(userInsert);
    }
}
