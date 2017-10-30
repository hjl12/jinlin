package com.chinasofti.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.chinasofti.entity.User;
import com.chinasofti.mapper.UserMapper;


//注解方式
@Service
public class UserService {
	
	
	//注入Dao
	@Autowired
	private UserMapper mapper;

	public List<User> queryUser() {
		return mapper.selectByExample(null);
		
	}

	public void insertUser(User user) {

		mapper.insert(user);
		
	}

	public User queryUserById(Integer id) {
		return mapper.selectByPrimaryKey(id);
	}

	

}
