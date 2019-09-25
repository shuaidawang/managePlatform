package com.chouxiaozi.platform.system.service.impl;

import com.chouxiaozi.platform.system.dao.SysUserDao;
import com.chouxiaozi.platform.system.entity.SysUser;
import com.chouxiaozi.platform.system.service.SysUserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.multipart.MultipartFile;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.ByteArrayOutputStream;
import java.util.*;

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
