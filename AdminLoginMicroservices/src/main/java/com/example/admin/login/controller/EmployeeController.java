package com.example.admin.login.controller;

import java.util.HashSet;
import java.util.List;
import java.util.Optional;
import java.util.Set;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.example.admin.login.exception.CustomException;
import com.example.admin.login.messages.DisplayMessages;
import com.example.admin.login.model.Employee;
import com.example.admin.login.repository.EmployeeRepository;
import com.example.admin.login.service.EmployeeService;

@RestController
@CrossOrigin("http://localhost:3000")
@RequestMapping("/employees")

public class EmployeeController {
	
	@Autowired
	private EmployeeService employeeService;

	public EmployeeController(EmployeeService employeeService) {
		super();
		this.employeeService = employeeService;
	}
	
	@PostMapping("/setEmployees")
	public ResponseEntity<Employee> saveEmployee(@Valid @RequestBody Employee employee){	
		Employee emp = employeeService.saveEmployee(employee);	
		return new ResponseEntity<Employee>(emp, HttpStatus.CREATED);
	}
	
	@GetMapping("/allEmployees")
	public List<Employee> getAllEmployees(){
		return employeeService.getAllEmloyeees();
	}
	
	
//	@PutMapping("/{employeeMail}/assign-manager/{mail}")
//	public void assignManager(@PathVariable("employeeMail") String employeeMail, @PathVariable("mail") String mail, Employee employee){
//		 employeeService.assignManager(employee, employeeMail, mail);
//		//return new ResponseEntity<Employee>(emp1, HttpStatus.OK);
//		 System.out.println("Emplyee with " + employeeMail + " assigned to " + "manager " + mail);
//		
//	}
	
	@PutMapping
	public ResponseEntity<Employee> assignManager(@RequestBody Employee employee){
		return new ResponseEntity<Employee>(employeeService.assignManager(employee),HttpStatus.OK);
	}
	
	//return DisplayMessages.getResponseEntity("Manager assigned successfully",HttpStatus.ACCEPTED);
	
	


}
