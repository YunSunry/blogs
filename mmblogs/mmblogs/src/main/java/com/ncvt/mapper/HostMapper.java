package com.ncvt.mapper;

import com.ncvt.entity.Host;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface HostMapper {
    //查询所有资讯
    List<Host> getAllHost();

    Host findById(int hostId);

    //分页查询
    List<Host> getHostByPage();

    //新增
    Integer insert(Host host);

    //根据id修改数据
    int update(Host host);

}
