package com.chouxiaozi.mybatisdruid.platform.system.service;


import com.chouxiaozi.mybatisdruid.platform.system.entity.SysUser;
import org.springframework.stereotype.Service;

@Service
public interface SysUserService {
	SysUser get(Long id);

}
