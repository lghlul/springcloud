package com.lu.feignconsumer.controller;

import com.lu.feignconsumer.service.HelloService;
import org.apache.logging.log4j.LogManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

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
    HelloService helloService;

    @RequestMapping(value = "/helloConsumer", method = RequestMethod.GET)
    public String helloConsumer() {
        logger.info("helloConsumer start...");
        return helloService.helloService();
    }

    @RequestMapping(value = "/hello", method = RequestMethod.GET)
    public String hello() {
        logger.info("hello start...");
        return "HELLO WORLD";
    }
}
