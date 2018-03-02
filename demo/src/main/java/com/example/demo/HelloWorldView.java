package com.example.demo;


import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by admin on 2018/2/27.
 */
@RestController
public class HelloWorldView {
  private final Logger logger= Logger.getLogger(getClass());

  @Autowired
  private DiscoveryClient client;
    @RequestMapping("/hello")
    public String HelloWorld(){

        ServiceInstance localServiceInstance = client.getLocalServiceInstance();
        logger.info("/hello:"+localServiceInstance.getHost()+"serviceId"+localServiceInstance.getServiceId());
        return "HelloWorld";
    }
}
