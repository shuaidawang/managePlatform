package com.chouxiaozi.platform;

import com.chouxiaozi.platform.system.service.SysUserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ManagePlatformApplicationTests {

	@Autowired
	private SysUserService sysUserService;
	@Test
	public void contextLoads() {
		System.out.println(sysUserService.get(1l));
	}

}
