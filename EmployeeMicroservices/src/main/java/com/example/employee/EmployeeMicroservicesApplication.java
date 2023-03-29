package com.example.employee;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class EmployeeMicroservicesApplication {

	public static void main(String[] args) {
		SpringApplication.run(EmployeeMicroservicesApplication.class, args);
		System.out.println("Employee microservice");
	}

}
