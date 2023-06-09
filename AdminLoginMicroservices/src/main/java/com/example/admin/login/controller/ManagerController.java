package com.example.admin.login.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.admin.login.messages.DisplayMessages;
import com.example.admin.login.model.Manager;
import com.example.admin.login.repository.EmployeeRepository;
import com.example.admin.login.repository.ManagerRepository;
import com.example.admin.login.service.ManagerService;

@RestController

@CrossOrigin("http://localhost:3000")
@RequestMapping("/manager")
public class ManagerController {
	
	@Autowired
	private ManagerService service;

	@Autowired
	private ManagerRepository repo;
	
	public ManagerController(ManagerService service) {
		super();
		this.service = service;
	}
	
	
	@PostMapping("/setManager")
	public ResponseEntity<Manager> saveManager(@Valid @RequestBody Manager manager){
		Manager m = service.saveManager(manager);
		String mail = manager.getMail();
		System.out.println(mail);
		
		return new ResponseEntity<Manager>(m, HttpStatus.CREATED);
	}
	
	
	@GetMapping("/check/{mail}")
	public ResponseEntity<Manager> getManagerByMailId(@PathVariable("mail") String mail){
		return new ResponseEntity<Manager>(service.getManagerByMail(mail), HttpStatus.OK);
	}
	
	
	@GetMapping
	public List<Manager> getAllManagers(){
		return service.getAllManagers();
	}
	
	
	
	

}
