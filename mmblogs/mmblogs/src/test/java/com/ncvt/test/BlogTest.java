package com.ncvt.test;

import com.ncvt.entity.Blog;
import com.ncvt.service.BlogService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:applicationContext_mapper.xml",
        "classpath:applicationContext_service.xml"})
public class BlogTest {
    @Autowired
    BlogService blogService;


    @Test
    public void findAll() {
        List<Blog> list = blogService.findAll(1);
        list.forEach(blog -> System.out.println(blog));
    }


    @Test
    public void deleteById() {
        int num = blogService.deleteById(8);
        System.out.println(num);
    }

    @Test
    public void insert() {
        Blog blog = new Blog();
        blog.setBlogText("ddddd");
        blog.setBlogLike(523);
        blog.setBlogRegion("南宁");
        blog.setBlogSharing(152);
        blog.setBlogComment("253");
        int insertNum = blogService.insert(blog);
        System.out.println("新增数据成功" + insertNum);

    }

    @Test
    public void update() {
        Blog blog = new Blog();
        blog.setBlogId(10);
        blog.setBlogText("青年读者");
        blog.setBlogLike(5253);
        blog.setBlogRegion("广州");
        blog.setBlogSharing(1527);
        blog.setBlogComment("253");
        int insertNum = blogService.update(blog);
        System.out.println("修改数据成功" + insertNum);

    }

    @Test
    public void findByI(){
        Blog byId = blogService.findById(9);
        System.out.println("查询数据成功"+byId);
    }

}
