package com.microservises.employee;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class EmpoyeeMicroservicesApplication {
	@Value("${addressService.base.url}")
	static String url;

	public static void main(String[] args) {
		SpringApplication.run(EmpoyeeMicroservicesApplication.class, args);
		System.out.println(url);

	}

}