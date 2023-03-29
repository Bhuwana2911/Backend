package com.example.leave.request.repository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.example.leave.request.model.LeaveRequest;


@Repository
public class LeaveRepo {

	@Autowired	
	private JdbcTemplate template;


	String sql = "select * from leave_request where employee_mail = ?";
	public List<LeaveRequest> findByEmployeeMail(String employeeMail) {
		List<LeaveRequest> l = template.query(sql, new Object[] {employeeMail}, new Mapper());
		
		return  l;
	}
				
	
		
}
