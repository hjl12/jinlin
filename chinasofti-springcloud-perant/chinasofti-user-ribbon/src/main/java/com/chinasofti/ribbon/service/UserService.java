package com.chinasofti.ribbon.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class UserService {

    @Autowired
    //@LoadBalanced
    RestTemplate restTemplate;

    public String hiService() {
        return restTemplate.getForObject("http://MYUSERSERVICE/user/hello",String.class);
    }

}