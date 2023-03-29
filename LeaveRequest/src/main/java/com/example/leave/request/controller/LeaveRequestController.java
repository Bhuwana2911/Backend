package com.example.leave.request.controller;

import java.util.List;

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

import com.example.leave.request.model.LeaveRequest;
import com.example.leave.request.repository.LeaveRequestRepository;
import com.example.leave.request.service.LeaveRequestService;

@RestController
@RequestMapping("/leave")
@CrossOrigin("http://localhost:3000")
public class LeaveRequestController {
	
	@Autowired
	private LeaveRequestRepository repo1;
	
	@Autowired
	private LeaveRequestService service;

	public LeaveRequestController(LeaveRequestService service) {
		super();
		this.service = service;
	}
	
	//Requesting for leave - Post request
	@PostMapping("/request")
	public ResponseEntity<LeaveRequest> createRequest(@RequestBody LeaveRequest leave){		
		LeaveRequest request = service.createRequest(leave);
		return new ResponseEntity<LeaveRequest>(request, HttpStatus.OK); 
	}
	
	
	@GetMapping("/leaves/{employeeMail}")
	public List<LeaveRequest> getAllRequestOfEmpployee(@PathVariable("employeeMail") String employeeMail){
		return service.allLeavesOfEmployee(employeeMail);
	}
	
	
	//Get leave status	
	@GetMapping("/status/{employeeMail}")
	public String getStatus(@PathVariable("employeeMail") String employeeMail) {
		LeaveRequest status_check = repo1.findByEmployeeMail(employeeMail);
		if(!(status_check.getEmployeeMail().equals(employeeMail))){
			return "No leave application";
		}
		String status = status_check.getStatus();
		return status;
	}
	
	
	
	

}