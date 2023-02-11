package com.ncvt.service.impl;

import com.ncvt.entity.At;
import com.ncvt.mapper.AtMapper;
import com.ncvt.service.AtService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * (At)表服务实现类
 *
 * @author makejava
 * @since 2022-11-30 13:40:58
 */
@Service("atService")
public class AtServiceImpl implements AtService {
    @Autowired
    AtMapper atMapper;

    @Override
    public int insert(At at) {
        return atMapper.insert(at);
    }

    @Override
    public List<At> findAtById(int usersId) {
        return atMapper.findAtById(usersId);
    }

    @Override
    public int count(int usersId) {
        return atMapper.count(usersId);
    }

    @Override
    public int deleteById(int atId) {
        return atMapper.deleteById(atId);
    }
}
