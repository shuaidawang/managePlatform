package com.chouxiaozi.mybatisdruid.platform.system.service.impl;

import com.chouxiaozi.mybatisdruid.platform.system.dao.SysUserDao;
import com.chouxiaozi.mybatisdruid.platform.system.entity.SysUser;
import com.chouxiaozi.mybatisdruid.platform.system.service.SysUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

//@CacheConfig(cacheNames = "user")
@Transactional
@Service
public class SysUserServiceImpl implements SysUserService {
    @Autowired
    SysUserDao sysUserMapper;
    @Override
    public SysUser get(Long id) {
        SysUser user = sysUserMapper.get(id);
        return user;
    }

}
