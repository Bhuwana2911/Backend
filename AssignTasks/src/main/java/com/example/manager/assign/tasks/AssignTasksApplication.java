package com.example.manager.assign.tasks;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class AssignTasksApplication {

	public static void main(String[] args) {
		SpringApplication.run(AssignTasksApplication.class, args);
		System.out.println("Assigining tasks microservice");
	}

}
