package com.example.view.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.view.controller.model.EmployeeViewModel;
import com.example.view.service.EmployeeUpdateService;

@RestController
@RequestMapping("/updateEmployee")
@CrossOrigin("http://localhost:3000")
public class EmployeeUpdateController {
	
	@Autowired
	private EmployeeUpdateService updateService;
	

	
	@PutMapping("/{employeeMail}")
	public ResponseEntity<EmployeeViewModel> updateEmployeeByEmployeeMail(
			@RequestBody EmployeeViewModel updated, @PathVariable("employeeMail") String employeeMail){
		
		EmployeeViewModel emp = updateService.updateEmployeeByEmployeeMail(updated, employeeMail);
		
		return new ResponseEntity<EmployeeViewModel>(emp,HttpStatus.OK);
	}
}
