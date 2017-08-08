package com.moecal.springcloud.web;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class CustomerController {
    private static final Logger LOGGER = LoggerFactory.getLogger(CustomerController.class);

@Autowired
    private RestTemplate restTemplate;


@RequestMapping("/customer")
public String customer(){
    String providerMsg = restTemplate.getForEntity("http://PROVIDER-SERVICE/provider", String.class).getBody();
    return "Hello,Customer! msg from provider : <br/><br/> " + providerMsg;
}
}
