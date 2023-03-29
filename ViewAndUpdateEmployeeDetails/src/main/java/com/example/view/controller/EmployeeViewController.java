package com.example.view.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.view.controller.model.EmployeeViewModel;
import com.example.view.messages.DisplayMessages;
import com.example.view.service.EmployeeViewService;

@RestController
@RequestMapping("/viewEmployee")
@CrossOrigin("http://localhost:3000")
public class EmployeeViewController {
	
	@Autowired
	private EmployeeViewService viewService;

	public EmployeeViewController(EmployeeViewService viewService) {
		super();
		this.viewService = viewService;
	}
	
	@GetMapping("/view/{employeeMail}")
	public ResponseEntity<?> getEmployeeByEmployeeMail(@PathVariable("employeeMail") String employeeMail){
		EmployeeViewModel emp = viewService.getEmployeeByEmployeeMail(employeeMail);
		if(emp == null) {
			System.out.println("Employee with " + employeeMail + " does not exists");
		}
		return new ResponseEntity<EmployeeViewModel>(emp,HttpStatus.OK);
	}
	
	
	
	
}
