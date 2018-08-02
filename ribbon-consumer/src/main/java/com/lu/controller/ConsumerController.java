package com.lu.controller;

import org.apache.logging.log4j.LogManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @CLassName ConsumerController
 * @Description TODO
 * @Author ll
 * @Date 2018/7/20 16:38
 **/
@RestController
public class ConsumerController {

    private static org.apache.logging.log4j.Logger logger = LogManager.getLogger(ConsumerController.class);

    @Autowired
    RestTemplate restTemplate;

    @RequestMapping(value = "/helloConsumer", method = RequestMethod.GET)
    public String helloConsumer() {
        logger.info("helloConsumer start...");
        return restTemplate.getForEntity("http://hello-service/hello",String.class).getBody();
    }

    @RequestMapping(value = "/hello", method = RequestMethod.GET)
    public String hello() {
        logger.info("hello start...");
        return "HELLO WORLD";
    }
}
