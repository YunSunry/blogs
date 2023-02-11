package com.ncvt.service.impl;

import com.ncvt.entity.Comments;
import com.ncvt.mapper.CommentsMapper;
import com.ncvt.service.CommentsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.List;

/**
 * (Comments)表服务实现类
 *
 * @author makejava
 * @since 2022-11-30 00:01:57
 */
@Service("commentsService")
public class CommentsServiceImpl implements CommentsService {

    @Autowired
    CommentsMapper commentsMapper;


    @Override
    public List<Comments> queryById(int hostId) {
        return commentsMapper.queryById(hostId);
    }

    @Override
    public int insert(Comments comments) {
        return commentsMapper.insert(comments);
    }

    @Override
    public int count(int hostId) {
        return commentsMapper.count(hostId);
    }
}
