package com.chouxiaozi.mail;

import com.chouxiaozi.mail.service.MailService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class MailApplicationTests {

    @Autowired
    private MailService MailService;

    @Test
    void contextLoads() {
        MailService.sendSimpleMail("455193135@qq.com","test simple mail"," hello this is simple mail");
    }

}
