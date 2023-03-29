package com.example.manager.login.repository;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.example.manager.login.model.JwtRequest;

public class AuthenticationMapper implements RowMapper<JwtRequest>{

	@Override
	public JwtRequest mapRow(ResultSet rs, int rowNum) throws SQLException {
		JwtRequest auth = new JwtRequest();
		auth.setMail(rs.getString("mail"));
		auth.setPassword(rs.getString("password"));
		return auth;
	}
	

}
