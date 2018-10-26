package com.lu.controller;

import com.lu.domain.User;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

/**
 * @CLassName HelloController
 * @Description TODO
 * @Author ll
 * @Date 2018/7/17 14:41
 **/
@RestController
public class HelloController {

    private static Logger logger = LogManager.getLogger(HelloController.class);

    @Autowired
    RestTemplate restTemplate;

    @RequestMapping(value="/hello",method=RequestMethod.GET)
    public String hello() throws Exception{
        return "Hello World";
    }
    @RequestMapping(value="/helloWorld",method=RequestMethod.GET)
    public String helloWorld(){
        logger.info("helloWorld start...");
        return restTemplate.getForEntity("http://ribbon-service/hello",String.class).getBody();
    }

    @RequestMapping(value="/hello1",method=RequestMethod.GET)
    public String hello1(@RequestHeader String name) throws Exception{
        return "name=" + name;
    }

    @RequestMapping(value="/hello2",method=RequestMethod.GET)
    public User hello2(@RequestHeader String name , @RequestHeader int age) throws Exception{
        return new User(name , age);
    }

    @RequestMapping(value="/hello3",method=RequestMethod.POST)
    public User hello3(@RequestBody User user) throws Exception{
        return user;
    }
}
