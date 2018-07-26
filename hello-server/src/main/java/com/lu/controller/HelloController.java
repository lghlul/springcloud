package com.lu.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.logging.Logger;

/**
 * @CLassName HelloController
 * @Description TODO
 * @Author ll
 * @Date 2018/7/17 14:41
 **/
@RestController
public class HelloController {

    private final Logger logger = Logger.getLogger(getClass().toString());

    @Autowired
    private DiscoveryClient client;

    @RequestMapping(value="/hello",method=RequestMethod.GET)
    public String index(){
        ServiceInstance instance = client.getLocalServiceInstance();
        System.out.println("/hello,host:" + instance.getHost() + ",service_id:" + instance.getServiceId());
        return "Hello World";
    }
}
