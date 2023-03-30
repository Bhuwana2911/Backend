package com.example.admin.login;

import static org.mockito.Mockito.verify;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import com.example.admin.login.repository.EmployeeRepository;
import com.example.admin.login.repository.ManagerRepository;
import com.example.admin.login.serviceImpl.EmployeeServiceImpl;
import com.example.admin.login.serviceImpl.ManagerServiceImpl;


@ExtendWith(MockitoExtension.class)
public class FindAllMethodCheck {
	
	
	//Testing check for all getting all employees
	@Mock
	private EmployeeRepository employeeRepo;
	
	@Mock
	private ManagerRepository managerRepo;
	
	
	private EmployeeServiceImpl service;
	
	private ManagerServiceImpl managerService;
	
	
//	@BeforeEach
//	void setUp() {
////		this.service = new EmployeeServiceImpl(this.employeeRepo);
//	}
	
	
	//Testing for getting all employees
	@Test
	void getAllEmployees() {
		this.service = new EmployeeServiceImpl(this.employeeRepo);
		service.getAllEmloyeees();
		verify(employeeRepo).findAll();
	}
	
	
	//Testing for getting all managers
	@Test
	void getAllManagers() {
		this.managerService = new ManagerServiceImpl(this.managerRepo);
		managerService.getAllManagers();
		verify(managerRepo).findAll();		
	}
	
	
	
	

}
