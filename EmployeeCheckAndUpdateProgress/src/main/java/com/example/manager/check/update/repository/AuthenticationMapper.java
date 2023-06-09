package com.example.manager.check.update.repository;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;

import org.springframework.jdbc.core.RowMapper;

import com.example.manager.check.update.model.Tasks;

public class AuthenticationMapper implements RowMapper<Tasks>{

	@Override
	public Tasks mapRow(ResultSet rs, int rowNum) throws SQLException {
		// TODO Auto-generated method stub
		
		Tasks t = new Tasks();		
		
		
		t.setId(rs.getString("id"));
		t.setDescription(rs.getString("description"));
		//t.setDeadline(rs.getString("d"));
		t.setEmployeeMail(rs.getString("employee_mail"));
		t.setMail(rs.getString("mail"));
		t.setEprogress(rs.getString(("eprogress")));
		t.setTstatus(rs.getString("tstatus"));
		
		return t;

	}

	
	

}
