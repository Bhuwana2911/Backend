package com.example.admin.login.service;

import java.util.List;
import java.util.Optional;

import com.example.admin.login.model.Employee;

public interface EmployeeService {
	Employee saveEmployee(Employee employee);
	List<Employee> getAllEmloyeees();
	Employee assignManager(Employee employee);
	
	
}
