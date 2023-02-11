package com.ncvt.service.impl;

import com.ncvt.entity.Blog;
import com.ncvt.mapper.BlogMapper;
import com.ncvt.service.BlogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("BlogService")
public class BlogServiceImpl implements BlogService {

    @Autowired
    BlogMapper blogMapper;

    @Override
    public List<Blog> findAll(int userId) {
        return blogMapper.findAll(userId);
    }

    @Override
    public Blog findById(int blogId) {
        return blogMapper.findById(blogId);
    }

    @Override
    public int deleteById(int blogId) {
        return blogMapper.deleteById(blogId);
    }

    @Override
    public Integer insert(Blog blog) {
        return blogMapper.insert(blog);
    }

    @Override
    public int update(Blog blog) {
        return blogMapper.update(blog);
    }
}
