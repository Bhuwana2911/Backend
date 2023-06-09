package com.example.manager.check.update.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.example.manager.check.update.model.Tasks;

import com.example.manager.check.update.service.CheckAndUpdateService;

@RestController
@RequestMapping("/checkAndupdate")
@CrossOrigin("http://localhost:3000")
public class CheckAndUpdateController {
	
	@Autowired
	private CheckAndUpdateService service;
	

	public CheckAndUpdateController(CheckAndUpdateService service) {
		super();
		this.service = service;
	}

	
	//----actually working this is without lists
//	@GetMapping("/tasks/{employeeMail}")
//	public ResponseEntity<Tasks> getTaskDetails(@PathVariable("employeeMail") String employeeMail){		
//		return new ResponseEntity<Tasks>(service.checkTasks(employeeMail), HttpStatus.OK);
//	}

	
	
	//get all tasks assigned to employee
	@GetMapping("/tasks/{employeeMail}")
	public List<Tasks> getAllRequests(@PathVariable("employeeMail") String employeeMail){
		return service.checkTasks(employeeMail);
	}
	
	
	//Put mapping for update progress
	@PutMapping("/progress/{id}")
	public ResponseEntity<Tasks> updateTaskStatus(@PathVariable("id") String id){
		return new ResponseEntity<Tasks>(service.updateTaskStatus(id), HttpStatus.OK);
		
	}
	
	
	
	
	
 
}
