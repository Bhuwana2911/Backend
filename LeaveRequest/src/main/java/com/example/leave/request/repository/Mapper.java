package com.example.leave.request.repository;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.example.leave.request.model.Employee;
import com.example.leave.request.model.LeaveRequest;

public class Mapper implements RowMapper<LeaveRequest>{

	@Override
	public LeaveRequest mapRow(ResultSet rs, int rowNum) throws SQLException {
		//Employee emp = new Employee();
		LeaveRequest l = new LeaveRequest();
		l.setId(rs.getLong("id"));
		l.setEmployeeMail(rs.getString("employee_mail"));
		l.setMail(rs.getString("mail"));
		l.setSdate(rs.getDate("sdate"));
		l.setEdate(rs.getDate("edate"));
		l.setReason(rs.getString("reason"));
		l.setStatus(rs.getString("status"));
		
		return l;
	}

}
