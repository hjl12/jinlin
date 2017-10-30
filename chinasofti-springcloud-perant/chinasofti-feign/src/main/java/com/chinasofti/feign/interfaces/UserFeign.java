package com.chinasofti.feign.interfaces;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

//,url="http://localhost:8081"
@FeignClient(name = "myuserservice" )
public interface UserFeign {
	
	@RequestMapping(value = "/user/hello")
    String helloFromClientOne();

}
