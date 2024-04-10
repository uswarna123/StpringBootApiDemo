package com.demo.stpringbootapidemo.service;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Component
public class DemoServiceImpl implements DemoService{

    RestTemplate restTemplate= new RestTemplate();
    @Override
    public Object callingExternalApi() {

        ResponseEntity<Object> res=restTemplate.getForEntity("https://api.github.com/users", Object.class);
        return res;
    }

    @Override
    public Object getUser(String name) {
        ResponseEntity<Object> res1=restTemplate.getForEntity("https://api.github.com/users/"+name, Object.class);
        return res1;
    }
}
