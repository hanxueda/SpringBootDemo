package com.example.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.User;

@RestController
public class HelloWorldController {

	@RequestMapping("/hello")
    public String index() {
        return "Hello World";
    }
	
	@RequestMapping("/getUser")
    public User getUser() {
    	User user=new User();
    	user.setUserName("小明");
    	user.setPassWord("123456");
        return user;
    }
}
