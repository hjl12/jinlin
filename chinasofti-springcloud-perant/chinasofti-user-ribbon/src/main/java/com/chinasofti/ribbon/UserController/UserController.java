package com.chinasofti.ribbon.UserController;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.chinasofti.ribbon.service.UserService;

@RestController
@RequestMapping("/user")
public class UserController {
	
	@Autowired
	private UserService userService;
	
	
	@GetMapping("hello")
	public String hello(){
		return userService.hiService();
		
	}
	
	
	/*@GetMapping("/{id}")
	public String queryUserById(@PathVariable Integer id){
		
		return restTemplate.getForObject("http://USER-SERVICE/user"+id, String.class);
		
		
	}
	
	@RequestMapping("/all")
	public String queryUser(){
		return restTemplate.getForObject("http://USER-SERVICE/user", String.class);
		
		
		
	}*/

}
