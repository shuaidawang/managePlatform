package com.chouxiaozi.platform.system.service;


import com.chouxiaozi.platform.system.entity.SysUser;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;
import java.util.Map;
import java.util.Set;

@Service
public interface SysUserService {
	SysUser get(Long id);

}
