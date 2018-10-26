package com.lu.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @CLassName HelloController
 * @Description TODO
 * @Author ll
 * @Date 2018/10/18 18:06
 **/
@RefreshScope
@RestController
public class TestController {

    @Value("${from}")
    private String from;


    @RequestMapping("/from")
    public String from() {
        return this.from;
    }

    @Autowired
    private Environment env;

    @RequestMapping("/from2")
    public String from2() {
        return env.getProperty("from" , "undefined");
    }
}
