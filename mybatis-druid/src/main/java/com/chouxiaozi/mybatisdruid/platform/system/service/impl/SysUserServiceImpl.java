package com.chouxiaozi.platform.system.service.impl;

import com.chouxiaozi.platform.system.dao.SysUserMapper;
import com.chouxiaozi.platform.system.entity.SysUser;
import com.chouxiaozi.platform.system.service.SysUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SysUserServiceImpl implements SysUserService {

    @Autowired(required = false)
    private SysUserMapper sysUserMapper;
    @Override
    public SysUser get(Long id) {
        SysUser user = sysUserMapper.get(id);
        return user;
    }

}
