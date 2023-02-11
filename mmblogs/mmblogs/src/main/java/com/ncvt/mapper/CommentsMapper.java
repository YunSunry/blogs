package com.ncvt.mapper;

import com.ncvt.entity.Comments;

import java.util.List;

public interface CommentsMapper {
    List<Comments> queryById(int hostId);

    int insert(Comments comments);

    int count(int hostId);

}
