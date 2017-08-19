package com.jackshenonly.controller;

import com.jackshenonly.entity.Person;
import com.jackshenonly.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by jackshenonly on 17/8/12.
 */

@RestController
@EnableConfigurationProperties({Person.class,User.class})
public class HelloController {

    @Value("${person.name}")
    private String name;
    @Value("${person.age}")
    private int age;

    @Autowired
    private Person person;

    @Autowired
    private User user;

    @RequestMapping("/")
    public String index(){
        return "Hello Spring Boot";
    }

    @RequestMapping("/who")
    public String toString() {
        return person.toString() + "\r\n" + person.getGreeting();
    }

    @RequestMapping("/user")
    public String witchUser(){
        return user.toString();
    }
}
