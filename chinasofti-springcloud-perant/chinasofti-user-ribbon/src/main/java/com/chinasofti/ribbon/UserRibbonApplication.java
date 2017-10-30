package com.chinasofti.ribbon;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
@EnableDiscoveryClient // 向服务中心注册
public class UserRibbonApplication {

	public static void main(String[] args) {
		SpringApplication.run(UserRibbonApplication.class, args);
	}

	/*
	 * @Bean//创建一个RestTemplate对象交给Spring管理
	 * 
	 * @LoadBalanced//说明这个RestTemplate开启了负载均衡. RestTemplate restTemplate(){
	 * return restTemplate(); }
	 */
	@Bean
	//@LoadBalanced
	@LoadBalanced
	RestTemplate restTemplate() {
		return new RestTemplate();
	}

}
