package com.ncvt.mapper;

import com.ncvt.entity.Users;

public interface UsersMapper {

    //根据id查询用户
    Users queryById(Integer usersId);

    Users Login(Users users);

    int update(Users users);

}
