package com.moecal.springcloud.web;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient("PROVIDER-SERVICE")
public interface DcClient {
    @GetMapping("/provider")
    String consumer();
}
