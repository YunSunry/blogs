package com.ncvt.service.impl;

import com.ncvt.entity.Users;
import com.ncvt.mapper.UsersMapper;
import com.ncvt.service.UsersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("usersService")
public class UsersServiceImpl implements UsersService {

    @Autowired
    UsersMapper usersMapper;

    @Override
    public Users queryById(Integer usersId) {
        return usersMapper.queryById(usersId);
    }

    @Override
    public Users Login(Users users) {
        return usersMapper.Login(users);
    }

    @Override
    public int update(Users users) {
        return usersMapper.update(users);
    }


}
