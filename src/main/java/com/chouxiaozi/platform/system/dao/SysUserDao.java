package com.chouxiaozi.platform.system.dao;

import com.chouxiaozi.platform.system.entity.SysUser;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
import java.util.Map;

/**
 *
 */
@Mapper
public interface SysUserDao {

	SysUser get(Long userId);

}
