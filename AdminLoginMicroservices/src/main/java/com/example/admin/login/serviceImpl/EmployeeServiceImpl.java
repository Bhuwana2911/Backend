package com.example.admin.login.serviceImpl;


import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.admin.login.exception.CustomException;
import com.example.admin.login.model.Employee;

import com.example.admin.login.repository.EmployeeRepository;
import com.example.admin.login.repository.ManagerRepository;
import com.example.admin.login.service.EmployeeService;



@Service
public class EmployeeServiceImpl implements EmployeeService{
	
	@Autowired
	private EmployeeRepository employeeRepository;
	
	@Autowired
	private ManagerRepository managerRepository;
	
	public EmployeeServiceImpl(EmployeeRepository employeeRepository) {
		super();
		this.employeeRepository = employeeRepository;
	}
	
	@Override
	public Employee saveEmployee(Employee employee) {
		Employee storedEmail = employeeRepository.findByEmployeeMail(employee.getEmployeeMail());
		Employee id = employeeRepository.findByEmployeeId(employee.getEmployeeId());
		if(storedEmail != null) {
			System.out.println("Record already exists");
			throw new CustomException("Employee", "EmployeeMail", employee.getEmployeeMail());
		}
		
		else if(id != null) {
			System.out.println("Employee with employee id already exists");
			throw new CustomException("Employee", "Employee id", employee.getEmployeeId());
		}
		
		
		return employeeRepository.save(employee);
	}
	
	
	@Override
	public List<Employee> getAllEmloyeees() {
		return employeeRepository.findAll();
	}

	@Override
	public Employee assignManager(Employee employee) {		
		employee.setMail(employee.getMail());		
		return employeeRepository.save(employee);
	}

	
}
