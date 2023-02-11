package com.ncvt.service.impl;

import com.ncvt.entity.Host;
import com.ncvt.mapper.HostMapper;
import com.ncvt.service.HostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * (Host)表服务实现类
 *
 * @author makejava
 * @since 2022-10-29 09:39:46
 */
@Service("hostService")
public class HostServiceImpl implements HostService {
    @Autowired
    HostMapper hostMapper;


    @Override
    public List<Host> getAllHost() {
        return hostMapper.getAllHost();
    }

    @Override
    public Host findById(int hostId) {
        return hostMapper.findById(hostId);
    }

    @Override
    public List<Host> getHostByPage() {
        return hostMapper.getHostByPage();
    }

    @Override
    public Integer insert(Host host) {
        return hostMapper.insert(host);
    }

    @Override
    public int update(Host host) {
        return hostMapper.update(host);
    }
}
