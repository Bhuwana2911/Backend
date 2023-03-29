package com.example.employee.repository;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.example.employee.model.JwtRequest;

public class AuthenticationMapper implements RowMapper<JwtRequest>{

	@Override
	public JwtRequest mapRow(ResultSet rs, int rowNum) throws SQLException {
		JwtRequest auth = new JwtRequest();
		auth.setEmployee_mail(rs.getString("employee_mail"));
		auth.setPassword(rs.getString("password"));
		return auth;
	}
	

}
