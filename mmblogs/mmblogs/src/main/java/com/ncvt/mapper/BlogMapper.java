package com.ncvt.mapper;



import java.util.List;
import com.ncvt.entity.Blog;
public interface BlogMapper {

    List<Blog> findAll(int userId);

    //根据id查询数据
    Blog findById(int blogId);

    int deleteById(int blogId);

    Integer insert(Blog blog);

    int update(Blog blog);
}
