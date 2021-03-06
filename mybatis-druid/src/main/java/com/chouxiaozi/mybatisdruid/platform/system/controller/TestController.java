package com.chouxiaozi.mybatisdruid.platform.system.controller;


import com.chouxiaozi.mybatisdruid.platform.system.entity.SysUser;
import com.chouxiaozi.mybatisdruid.platform.system.service.SysUserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.sql.DataSource;
import java.sql.ResultSet;
import java.sql.SQLException;

@Controller
@RestController
public class TestController {
    @Autowired
    private SysUserService sysUserService;
    Logger logger = LoggerFactory.getLogger(TestController.class);

    @RequestMapping("/hello")
    public String sayHello(){
        return "hello gouzi";
    }

    @RequestMapping("/get")
    public SysUser get(String id){
        Long userId = Long.valueOf(id);
        SysUser sysUser = sysUserService.get(userId);
        return sysUser;
    }
    @Autowired
    private DataSource dataSource;

    @RequestMapping("/getName")
    public String getUsername(){
        logger.info("查询姓名");
        logger.error("ggggggggg");
        String name = null;
        String sql = "select user.name from tab_user user where user.id = 1";
        try {
            ResultSet rs = dataSource.getConnection().createStatement().executeQuery(sql);
            if(rs.next()){
                name = rs.getString("name");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return name;
    }
}
