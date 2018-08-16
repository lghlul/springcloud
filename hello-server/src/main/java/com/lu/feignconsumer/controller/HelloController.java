package com.lu.feignconsumer.controller;

import org.apache.logging.log4j.LogManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.Random;

/**
 * @CLassName HelloController
 * @Description TODO
 * @Author ll
 * @Date 2018/7/17 14:41
 **/
@RestController
public class HelloController {

    private static org.apache.logging.log4j.Logger logger = LogManager.getLogger(HelloController.class);

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

}
