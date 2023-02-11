package com.ncvt.mapper;


import com.ncvt.entity.At;

import java.util.List;

public interface AtMapper {

    int insert(At at);

    List<At> findAtById(int usersId);

    int count(int usersId);

    int deleteById(int atId);


}
