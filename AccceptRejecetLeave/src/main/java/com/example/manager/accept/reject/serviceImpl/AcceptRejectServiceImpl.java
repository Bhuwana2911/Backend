package com.example.manager.accept.reject.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.manager.accept.reject.model.LeaveRequestModel;
import com.example.manager.accept.reject.repository.AcceptRejectRepo;
import com.example.manager.accept.reject.repository.AcceptRejectRepository;
import com.example.manager.accept.reject.service.AcceptRejectService;


@Service
public class AcceptRejectServiceImpl implements AcceptRejectService{


	@Autowired
	private AcceptRejectRepo acceptRejectRepo;


	@Autowired
	private AcceptRejectRepository aacceptRejectRepository;

	
	//all leave requests of that manager
	@Override
	public List<LeaveRequestModel> getAllRequests(String mail) {
		return acceptRejectRepo.findByMail(mail);
	}
	
	
	
    //reject leave
	@Override
	public LeaveRequestModel rejectLeave(LeaveRequestModel l, String employeeMail) {
		LeaveRequestModel exists = aacceptRejectRepository.findByEmployeeMail(employeeMail);
		if(exists != null ) {
			if(exists.getStatus().equals("Pending"))
				exists.setStatus("Rejected");
			else if(exists.getStatus().equals("Accepted"))
				exists.setStatus("Rejected");
		}		
		return aacceptRejectRepository.save(exists);	}
	
	
	
    //accept leave
	@Override
	public LeaveRequestModel acceptLeave(LeaveRequestModel acccept, String employeeMail) {
		LeaveRequestModel exists1 = aacceptRejectRepository.findByEmployeeMail(employeeMail);
		if(exists1.getStatus().equals("Pending")) {
			exists1.setStatus("Accepted");
		}
		
		return aacceptRejectRepository.save(exists1);
	}



    //applied leaves of that employee
//	@Override
//	public List<LeaveRequestModel> allLeavesOfEmployee(String employeeMail) {
//		return aacceptRejectRepository.findByEmployeeMail(employeeMail);
//		
//	}






}
