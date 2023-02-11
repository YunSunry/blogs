package com.ncvt.service;

import com.ncvt.entity.Host;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * (Host)表服务接口
 *
 * @author makejava
 * @since 2022-10-29 09:37:44
 */
public interface HostService {

    //查询所有资讯
    List<Host> getAllHost();

    Host findById(int hostId);

    //分页查询
    List<Host> getHostByPage();

    Integer insert(Host host);

    //修改数据
    int update(Host host);


}
