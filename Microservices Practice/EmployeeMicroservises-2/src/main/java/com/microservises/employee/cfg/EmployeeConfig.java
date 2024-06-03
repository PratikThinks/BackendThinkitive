package com.microservises.employee.cfg;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class EmployeeConfig {
    @Autowired
    @Bean
    public ModelMapper modelMapper(){
        return new ModelMapper();
    }




//    @Bean
//    public RestTemplate restTemplate(){
//        return new RestTemplate();
//    }
}
