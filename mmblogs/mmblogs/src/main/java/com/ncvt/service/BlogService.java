package com.ncvt.service;

import com.ncvt.entity.Blog;
import com.ncvt.entity.Host;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface BlogService {
    List<Blog> findAll(int userId);

    Blog findById(int blogId);

    int deleteById(int blogId);

    Integer insert(Blog blog);

    int update(Blog blog);
}
