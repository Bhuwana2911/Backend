package com.example.leave.request;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class LeaveRequestApplication {

	public static void main(String[] args) {
		SpringApplication.run(LeaveRequestApplication.class, args);
		System.out.println("Leave Request Microservice");
	}

}
