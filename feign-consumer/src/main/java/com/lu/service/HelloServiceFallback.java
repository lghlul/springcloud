package com.lu.service;

import com.lu.domain.User;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @CLassName HelloServiceFallback
 * @Description 失败回调 来指定对应的服务降级实现类
 * @Author ll
 * @Date 2018/10/16 15:48
 **/
@Component
public class HelloServiceFallback implements IHelloService{

    @Override
    public String hello() {
        return null;
    }

    @Override
    public String hello1(@RequestHeader("name")String name) {
        return null;
    }

    @Override
    public String hello2(@RequestHeader("name")String name,@RequestHeader("age") int age) {
        return null;
    }

    @Override
    public String hello3(@RequestBody User user) {
        return null;
    }

    @Override
    public String hello(@RequestParam("name") String name) {
        return null;
    }

    @Override
    public User hello(@RequestHeader("name") String name,@RequestHeader("age") Integer age) {
        return null;
    }

    @Override
    public String hello(@RequestBody User user) {
        return null;
    }
}
