package com.ncvt.service;

import com.ncvt.entity.At;

import java.util.List;

/**
 * (At)表服务接口
 *
 * @author makejava
 * @since 2022-11-30 13:40:58
 */
public interface AtService {

    int insert(At at);

    List<At> findAtById(int usersId);

    int count(int usersId);


    int deleteById(int atId);
}
