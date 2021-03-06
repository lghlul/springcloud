package com.lu.service;

import com.lu.domain.User;
import org.springframework.web.bind.annotation.*;

/**
 * @CLassName HelloService
 * @Description TODO
 * @Author ll
 * @Date 2018/8/22 17:38
 **/
@RequestMapping("/refactor")
public interface HelloService {
    @RequestMapping(value = "/hello4", method = RequestMethod.GET)
    String hello(@RequestParam("name") String name);

    @RequestMapping(value = "/hello5", method = RequestMethod.GET)
    User hello(@RequestHeader("name") String name, @RequestHeader("age") Integer age);

    @RequestMapping(value= "/hello6", method= RequestMethod.POST)
    String hello(@RequestBody User user);
}
