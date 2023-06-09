package com.example.manager.accept.reject.service;

import java.util.List;

import com.example.manager.accept.reject.model.LeaveRequestModel;

public interface AcceptRejectService {
	
	List<LeaveRequestModel> getAllRequests(String mail);
	
	LeaveRequestModel rejectLeave(LeaveRequestModel reject, String mail);
	
	LeaveRequestModel acceptLeave(LeaveRequestModel accpet, String mail);
	
//	List<LeaveRequestModel> allLeavesOfEmployee(String employeeMail); 
	
}
