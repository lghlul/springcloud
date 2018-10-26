package com.lu.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @CLassName HelloController
 * @Description TODO
 * @Author ll
 * @Date 2018/10/18 18:06
 **/
@RestController
public class HelloController {
    @RequestMapping("/local/hello")
    public String hello(){
        return "local hello";
    }
}
