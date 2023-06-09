package com.example.leave.request.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.leave.request.model.LeaveRequest;

@Repository
public interface LeaveRequestRepository extends JpaRepository<LeaveRequest, Long>{
	
	LeaveRequest findByEmployeeMail(String employeeMail);
	LeaveRequest findByMail(String mail);
	

}
