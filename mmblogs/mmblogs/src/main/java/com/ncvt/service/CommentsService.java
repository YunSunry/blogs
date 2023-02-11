package com.ncvt.service;

import com.ncvt.entity.Comments;

import java.util.List;

/**
 * (Comments)表服务接口
 *
 * @author makejava
 * @since 2022-11-30 00:01:57
 */
public interface CommentsService {

    List<Comments> queryById(int hostId);

    int insert(Comments comments);

    int count(int hostId);



}
