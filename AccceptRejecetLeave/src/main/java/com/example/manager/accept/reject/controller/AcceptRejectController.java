package com.example.manager.accept.reject.controller;

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

import com.example.manager.accept.reject.model.LeaveRequestModel;
import com.example.manager.accept.reject.repository.AcceptRejectRepository;
import com.example.manager.accept.reject.service.AcceptRejectService;


@RestController
@RequestMapping("/ar")
@CrossOrigin("http://localhost:3000")
public class AcceptRejectController {
	
	@Autowired
	private AcceptRejectService service;
	
	@Autowired
	private AcceptRejectRepository repo;
	
	public AcceptRejectController(AcceptRejectService service) {
		super();
		this.service = service;
	}

	//Get all requests assigned to manager
	@GetMapping("/{mail}")
	public List<LeaveRequestModel> getAllRequests(@PathVariable("mail") String mail){
		return service.getAllRequests(mail);
	}
	
	
	
	//Reject Leave 	
	@PutMapping("/reject/{employeeMail}")
	public ResponseEntity<LeaveRequestModel> rejectLeave( LeaveRequestModel l, @PathVariable("employeeMail") String employeeMail) {
		LeaveRequestModel reject = service.rejectLeave(l, employeeMail);
		return new ResponseEntity<LeaveRequestModel>(reject, HttpStatus.OK);
	}
	
	
	@PutMapping("/accept/{employeeMail}")
	public ResponseEntity<LeaveRequestModel> acceptLeave( LeaveRequestModel l, @PathVariable("employeeMail") String employeeMail) {
		LeaveRequestModel accept = service.acceptLeave(l, employeeMail);
		return new ResponseEntity<LeaveRequestModel>(accept, HttpStatus.OK);
	}

}
