package com.example.leave.request.serviceImpl;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.example.leave.request.model.Employee;
import com.example.leave.request.model.LeaveRequest;
import com.example.leave.request.model.Manager;
import com.example.leave.request.repository.LeaveRepo;
import com.example.leave.request.repository.LeaveRequestRepository;
import com.example.leave.request.service.LeaveRequestService;


@Service
public class LeaveRequestServiceImpl implements LeaveRequestService{
	
	@Autowired
	private LeaveRequestRepository repo;
	
	@Autowired
	private LeaveRepo leaveRepo;
	
	public LeaveRequestServiceImpl(LeaveRequestRepository repo) {
		super();
		this.repo = repo;
	}
	

	@Override
	public LeaveRequest createRequest(LeaveRequest leave) {
		leave.setStatus("Pending");
		if(leave.getSdate().after(leave.getEdate())) {
			throw new RuntimeException("Leave can't apply");
		}

		return repo.save(leave);		
	}


	//all applied leaves of employee
	@Override
	public List<LeaveRequest> allLeavesOfEmployee(String employeeMail) {
		return leaveRepo.findByEmployeeMail(employeeMail);
	}







	
}
