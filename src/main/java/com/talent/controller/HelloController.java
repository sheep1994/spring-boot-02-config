package com.talent.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author guobing
 * @Title: HelloController
 * @ProjectName spring-boot-02-config
 * @Description: TODO
 * @date 2018/12/24下午3:01
 */
@RestController
public class HelloController {

    @Value("${person.lastName}")
    private String name;

    @RequestMapping("/sayHello")
    public String sayHello() {
        return "Hello" + name;
    }
}
