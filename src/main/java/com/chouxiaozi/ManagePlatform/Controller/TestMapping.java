package com.chouxiaozi.ManagePlatform.Controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
@RestController
public class TestMapping {
    @RequestMapping("/hello")
    public String sayHello(){
        return "hello gouzi";
    }
}
