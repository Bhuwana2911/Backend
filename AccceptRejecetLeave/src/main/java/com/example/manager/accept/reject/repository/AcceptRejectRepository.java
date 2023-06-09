package com.example.manager.accept.reject.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.manager.accept.reject.model.LeaveRequestModel;

@Repository
public interface AcceptRejectRepository extends JpaRepository<LeaveRequestModel, Long>{
//	LeaveRequestModel findByEmployeeMail(String employeeMail);
	
	LeaveRequestModel findByEmployeeMail(String employeeMail);
	
	
	
	

}
