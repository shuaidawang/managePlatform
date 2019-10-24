package com.chouxiaozi.shiro.service;

import com.chouxiaozi.shiro.enity.UserInfo;

public interface UserInfoService {
    UserInfo findByUsername(String userName);
}
