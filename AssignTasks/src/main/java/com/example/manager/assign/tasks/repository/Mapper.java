package com.example.manager.assign.tasks.repository;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.example.manager.assign.tasks.model.Tasks;



public class Mapper implements RowMapper<Tasks>{

	@Override
	public Tasks mapRow(ResultSet rs, int rowNum) throws SQLException {
		Tasks t = new Tasks();
		
		t.setDescription(rs.getString("description"));
		t.setId(rs.getString("id"));
		t.setEmployeeMail(rs.getString("employee_mail"));
		t.setMail(rs.getString("mail"));
		t.setTstatus(rs.getString("tstatus"));
		t.setEprogress(rs.getString("eprogress"));
		
		
		
		
		
		return t;
		
	}
	

}
