package com.example.manager.check.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.manager.check.model.Employee;
import com.example.manager.check.service.ManagerLoginService;



@RestController
@RequestMapping("/manager")
@CrossOrigin("http://localhost:3000")
public class ManagerLoginController {
	
	@Autowired
	private ManagerLoginService service;

	public ManagerLoginController(ManagerLoginService service) {
		super();
		this.service = service;
	}
	
	
	@GetMapping("/{mail}")
	public List<Employee> getAllEmployeesOfManager(@PathVariable("mail") String mail){
		return service.getAllEmployeesOfManager(mail);
	}
	
	

	
}
