package com.lu.feignconsumer.service;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.apache.logging.log4j.LogManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 * @CLassName HelloService
 * @Description TODO
 * @Author ll
 * @Date 2018/8/6 16:58
 **/
@Service
public class HelloService {
    private static org.apache.logging.log4j.Logger logger = LogManager.getLogger(HelloService.class);

    @Autowired
    RestTemplate restTemplate;

    @HystrixCommand(fallbackMethod = "helloFallBack")
    public String helloService(){
        long start = System.currentTimeMillis();
        logger.info("helloService...start=" + start);
        String body = restTemplate.getForEntity("http://hello-service/hello", String.class).getBody();
        long end = System.currentTimeMillis();
        logger.info("helloService...end=" + end);
        logger.info("helloService...cost=" + (end-start));
        return body;
    }

    public String helloFallBack(){
        return "error";
    }
}
