package com.microservises.employee;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients(basePackages = "com.microservises.employee.cfg")
public class EmpoyeeMicroservicesApplication {
	@Value("${addressService.base.url}")
	static String url;

	public static void main(String[] args) {
		SpringApplication.run(EmpoyeeMicroservicesApplication.class, args);
		System.out.println(url);

	}

}
