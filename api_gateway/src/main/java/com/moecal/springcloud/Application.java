package com.moecal.springcloud;

import com.moecal.springcloud.filter.AccessFilter;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.annotation.Bean;

public class Application {
    public static void main(String[] args) {
        new SpringApplicationBuilder(Application.class).web(true).run(args);

    }



    @Bean
    public AccessFilter accessFilter(){
        return  new AccessFilter();
    }
}
