package com.chouxiaozi.platform.system.service.impl;

import com.chouxiaozi.platform.system.dao.SysMenuMapper;
import com.chouxiaozi.platform.system.entity.SysMenu;
import com.chouxiaozi.platform.system.service.SysMenuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SysMenuServiceImpl implements SysMenuService {

    @Autowired
    private SysMenuMapper sysMenuMapper;

    @Override
    public SysMenu get(Integer id) {
        return sysMenuMapper.selectByPrimaryKey(id);
    }
}
