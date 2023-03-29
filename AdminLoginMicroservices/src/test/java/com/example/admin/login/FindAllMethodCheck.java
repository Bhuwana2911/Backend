package com.example.admin.login;

import static org.mockito.Mockito.verify;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import com.example.admin.login.repository.EmployeeRepository;
import com.example.admin.login.serviceImpl.EmployeeServiceImpl;


@ExtendWith(MockitoExtension.class)
public class FindAllMethodCheck {
	
	
	//Testing check for all getting all employees
	@Mock
	private EmployeeRepository employeeRepo;
	
	private EmployeeServiceImpl service;
	
	
	@BeforeEach
	void setUp() {
		this.service = new EmployeeServiceImpl(this.employeeRepo);
	}
	
	@Test
	void getAllEmployees() {
		service.getAllEmloyeees();
		verify(employeeRepo).findAll();
	}
	
	

}
