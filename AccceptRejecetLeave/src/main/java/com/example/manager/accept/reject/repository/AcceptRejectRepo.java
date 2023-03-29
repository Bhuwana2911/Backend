package com.example.manager.accept.reject.repository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;


import com.example.manager.accept.reject.model.LeaveRequestModel;

@Repository
public class AcceptRejectRepo {
	
	@Autowired
	private JdbcTemplate template;
	
	String sql = "select * from leave_request where mail = ?";
	
	public List<LeaveRequestModel> findByMail(String mail) {
		List<LeaveRequestModel> l = template.query(sql, new Object[] {mail}, new Mapper());		
		return l;
	}
	
	
	

}
