package com.chouxiaozi.shiro.repository;

import com.chouxiaozi.shiro.enity.UserInfo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserInfoRepository extends JpaRepository<UserInfo,Integer> {
    UserInfo findByName(String name);
}
