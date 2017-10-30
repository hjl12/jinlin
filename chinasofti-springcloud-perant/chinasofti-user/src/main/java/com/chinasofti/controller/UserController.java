package com.chinasofti.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.chinasofti.entity.User;
import com.chinasofti.service.UserService;

@RestController
@RequestMapping("/user")
public class UserController {

	@Autowired
	private UserService service;

	@Value("${server.port}")
	String port;

	@GetMapping("hello")
	public String hello() {

		return "hello"+port;

	}

	@RequestMapping("/all")
	public List<User> queryUser() {

		System.out.println("server.port=" + port);

		List<User> list = service.queryUser();

		return list;

	}

	@RequestMapping("{id}")
	// 将访问路径中的占位符的注入到同名的参数中.如不同命,则增加 (value="id")来注入指定的名称
	public User queryUserById(@PathVariable Integer id) {

		System.out.println("server.port=" + port);
		return service.queryUserById(id);

	}

	@RequestMapping("/insert")
	public String insertUser() {

		User user = new User();

		user.setUsername("秋天的虫子");
		user.setAddress("南山科技园");
		user.setSex("男");

		try {
			service.insertUser(user);

			return "添加成功";
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return "添加失败";
		}

	}

}