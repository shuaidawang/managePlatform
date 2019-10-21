package com.chouxiaozi.mybatisdruid.platform.system.dao;

import com.chouxiaozi.mybatisdruid.platform.system.entity.SysUser;
import org.apache.ibatis.annotations.Mapper;

/**
 *
 */
@Mapper
public interface SysUserMapper {

	SysUser get(Long userId);

}
