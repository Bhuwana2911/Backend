package com.example.admin.login;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication()
public class AdminLoginMicroservicesApplication {

	public static void main(String[] args) {
		SpringApplication.run(AdminLoginMicroservicesApplication.class, args);
		System.out.println("Admin microservice");
	}

}
