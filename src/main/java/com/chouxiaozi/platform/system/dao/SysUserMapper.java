package com.chouxiaozi.platform.system.dao;

import com.chouxiaozi.platform.system.entity.SysUser;
import org.apache.ibatis.annotations.Mapper;

/**
 *
 */
@Mapper
public interface SysUserMapper {

	SysUser get(Long userId);

}
