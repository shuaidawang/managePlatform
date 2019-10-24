package com.chouxiaozi.shiro.service.impl;

import com.chouxiaozi.shiro.enity.UserInfo;
import com.chouxiaozi.shiro.repository.UserInfoRepository;
import com.chouxiaozi.shiro.service.UserInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserInfoServiceImpl implements UserInfoService {

    @Autowired
    UserInfoRepository userInfoRepository;

    @Override
    public UserInfo findByUsername(String userName) {
        return userInfoRepository.findByName(userName);
    }
}
