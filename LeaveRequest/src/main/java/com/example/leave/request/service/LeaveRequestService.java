package com.example.leave.request.service;

import java.util.List;

import com.example.leave.request.model.LeaveRequest;


public interface LeaveRequestService {
	
	LeaveRequest createRequest(LeaveRequest leave);
	//LeaveRequest updateRequest(LeaveRequest l, String employeeMail);
	
	//LeaveRequest checkStatus(LeaveRequest l, String employeeMail);
	
	List<LeaveRequest> allLeavesOfEmployee(String employeeMail);
	
	
}
