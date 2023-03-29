package com.example.manager.accept.reject.repository;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;


import com.example.manager.accept.reject.model.LeaveRequestModel;

public class Mapper implements RowMapper<LeaveRequestModel>{

	@Override
	public LeaveRequestModel mapRow(ResultSet rs, int rowNum) throws SQLException {
		LeaveRequestModel l = new LeaveRequestModel();
		
		l.setId(rs.getLong("id"));
		l.setEdate(rs.getDate("edate"));
		l.setSdate(rs.getDate("sdate"));
		l.setEmployeeMail(rs.getString("employee_mail"));
		l.setReason(rs.getString("reason"));
		l.setStatus(rs.getString("status"));		
		l.setMail(rs.getString("mail"));
		
		
		
		
		return l;
		
	}
	

}
