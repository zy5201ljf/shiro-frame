package com.levmin.shiro.service.impl;

import com.levmin.shiro.entity.SystemUser;
import com.levmin.shiro.mapper.SystemUserMapper;
import com.levmin.shiro.service.SystemUserService;
import jakarta.annotation.Resource;
import org.springframework.stereotype.Service;

@Service
public class SystemUserServiceImpl implements SystemUserService {

    @Resource
    private SystemUserMapper systemUserMapper;

    @Override
    public SystemUser selectById(Integer id) {
        return systemUserMapper.selectByPrimaryKey(id);
    }
}
