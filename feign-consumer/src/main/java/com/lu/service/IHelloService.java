package com.lu.service;

import com.lu.domain.User;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.*;

/**
 * @CLassName HelloService
 * @Description TODO
 * @Author ll
 * @Date 2018/8/10 15:38
 **/
@FeignClient(name="hello-service",fallback = HelloServiceFallback.class)
public interface IHelloService  {
    @RequestMapping(value="/hello")
    String hello();

    @RequestMapping(value="/hello1",method = RequestMethod.GET)
    String hello1(@RequestHeader("name") String name);

    @RequestMapping(value="/hello2",method = RequestMethod.GET)
    String hello2(@RequestHeader("name") String name , @RequestHeader("age") int age);

    @RequestMapping(value="/hello3",method = RequestMethod.POST)
    String hello3(@RequestBody User user);

    @RequestMapping(value = "/hello4", method = RequestMethod.GET)
    String hello(@RequestParam("name") String name);

    @RequestMapping(value = "/hello5", method = RequestMethod.GET)
    User hello(@RequestHeader("name") String name, @RequestHeader("age") Integer age);

    @RequestMapping(value= "/hello6", method= RequestMethod.POST)
    String hello(@RequestBody User user);
}
