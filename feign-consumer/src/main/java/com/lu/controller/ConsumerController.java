package com.lu.controller;

import com.lu.domain.User;
import com.lu.service.IHelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @CLassName ConsumerController
 * @Description TODO
 * @Author ll
 * @Date 2018/8/10 16:02
 **/
@RestController
public class ConsumerController {
    @Autowired
    IHelloService helloService;

    @RequestMapping(value = "/feign-consumer", method = RequestMethod.GET)
    public String helloConsumer() {
        return helloService.hello();
    }


    @RequestMapping(value = "/hello-feign-consumer", method = RequestMethod.GET)
    public String hello() {
        return "hello";
    }

    @RequestMapping(value = "/feign-consumer1", method = RequestMethod.GET)
    public String helloConsumer1() {
        return helloService.hello1("luliang");
    }

    @RequestMapping(value = "/feign-consumer2", method = RequestMethod.GET)
    public String helloConsumer2() {
        return helloService.hello2("luliang", 25);
    }

    @RequestMapping(value = "/feign-consumer3", method = RequestMethod.GET)
    public String helloConsumer3() {
        return helloService.hello3(new User("luliang", 25));
    }


    @RequestMapping(value = "/feign-consumer4", method = RequestMethod.GET )
    public String helloConsumer4() {
        StringBuilder sb = new StringBuilder();
        sb.append(helloService.hello("MIMI")).append("\n");
        sb.append(helloService.hello("MIMI", 20) ).append("\n");
        sb.append(helloService.hello(new User("M工MI",20))).append("\n");
        return sb.toString();
    }
}
