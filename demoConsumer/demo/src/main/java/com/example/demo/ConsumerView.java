package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * Created by admin on 2018/2/28.
 */
@RestController
public class ConsumerView {
    @Autowired
    private RestTemplate restTemplate;

    @RequestMapping("/test")
    public String test(){
        return restTemplate.getForEntity("http://DEMOCLIENT/hello",String.class).getBody();
    }
}
