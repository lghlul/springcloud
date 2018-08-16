package com.lu.feignconsumer.service;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @CLassName HelloService
 * @Description TODO
 * @Author ll
 * @Date 2018/8/10 15:38
 **/
@Component
@FeignClient("hello-service")
public interface HelloService {
    @RequestMapping("/hello")
    String hello();
}
