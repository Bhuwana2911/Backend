package com.example.admin.login.serviceImpl;


import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.admin.login.exception.CustomException;
import com.example.admin.login.model.Employee;
import com.example.admin.login.model.Manager;
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
		
		String mail = employee.getMail();
	
		
		
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
		
//		if(storedEmail == null) {
//			if(mail.contains("gmail")) {
//				System.out.println("No gmail");
//			}
//			else {
//				employeeRepository.save(employee);
//			}
//		}
		
//		Manager mng = managerRepository.findByMail(employee.getMail());
//		
//		if(mng.getMail() == null) {
//			System.out.println("Manager with mail " + employee.getMail() + " does not exists");
//		}
//		System.out.println(employee.getEmployeeMail() + " employee mail");
//		System.out.println(employee.getMail() + " Manager mail");
//		
//		if(!(employee.getEmployeeMail().equals(mng.getMail()))) {
//			employee.setMail(employee.getMail());
//		}
		//employee.setMail(employee.getMail());	
		
		
		return employeeRepository.save(employee);
		
	
	}
	
	
	@Override
	public List<Employee> getAllEmloyeees() {
		return employeeRepository.findAll();
	}

	@Override
	public Employee assignManager(Employee employee) {	
		//Employee exists = employeeRepository.findByEmployeeMail(employee.getEmployeeMail());
		Manager mng = managerRepository.findByMail(employee.getMail());
//		if(exists == null) {
//			System.out.println("No employee with record " + employee.getEmployeeMail()+ " exists");
//		}
//		
		if(mng.getMail() == null) {
			System.out.println("Manager with mail " + employee.getMail() + " does not exists");
		}
//		System.out.println(employee.getEmployeeMail() + " employee mail");
//		System.out.println(employee.getMail() + " Manager mail");
//		
//		if(!(employee.getEmployeeMail().equals(employee.getMail()))) {
//
//			employee.setMail(employee.getMail());
//		}
		//employee.setMail(employee.getMail());	
		return employeeRepository.save(employee);
	}

	
}
