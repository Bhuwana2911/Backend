package com.example.admin.login.serviceImpl;


import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.admin.login.exception.CustomException;
import com.example.admin.login.model.Employee;
import com.example.admin.login.repository.EmployeeRepository;
import com.example.admin.login.service.EmployeeService;


@Service
public class EmployeeServiceImpl implements EmployeeService{
	
	@Autowired
	private EmployeeRepository employeeRepository;
	
	public EmployeeServiceImpl(EmployeeRepository employeeRepository) {
		super();
		this.employeeRepository = employeeRepository;
	}
	
	@Override
	public Employee saveEmployee(Employee employee) {
		Employee storedEmail = employeeRepository.findByEmployeeMail(employee.getEmployeeMail());
		if(storedEmail != null) {
			System.out.println("Record already exists");
			//return storedEmail;
			throw new CustomException("Employee", "EmployeeMail", employee.getEmployeeMail());
		}
		
		
		return employeeRepository.save(employee);
	}
	
	@Override
	public List<Employee> getAllEmloyeees() {
		return employeeRepository.findAll();
	}

	


}
