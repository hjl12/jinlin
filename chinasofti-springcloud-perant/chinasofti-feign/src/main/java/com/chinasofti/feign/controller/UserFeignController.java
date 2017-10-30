package com.chinasofti.feign.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.chinasofti.feign.interfaces.UserFeign;

@RestController
public class UserFeignController {
	
	@Autowired
	UserFeign userFeign;
	
	
	@RequestMapping("/hello")
	public String sayHello(){
		return userFeign.helloFromClientOne();
		
	}
	
	@RequestMapping("/test")
	public String test(){
		return "test";
	}
	
}
