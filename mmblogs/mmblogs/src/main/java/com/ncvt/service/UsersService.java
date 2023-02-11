package com.ncvt.service;

import com.ncvt.entity.Users;

public interface UsersService {

    /*根据id查询单挑用户信息*/
    Users queryById(Integer usersId);

    //用户登录
    Users Login(Users users);

    //用户信息修改
    int update(Users users);

}
