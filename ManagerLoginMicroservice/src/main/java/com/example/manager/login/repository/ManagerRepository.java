package com.example.manager.login.repository;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.example.manager.login.model.JwtRequest;

import org.springframework.security.core.userdetails.User;
//import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;


@Repository
public class ManagerRepository {
	
	@Autowired
	private JdbcTemplate template;
	public UserDetails loadByusername(String mail) {
		
		String query = "select * from manager where mail=?";		
		
		JwtRequest auth = template.queryForObject(query, new Object[] { mail }, new AuthenticationMapper());
		
			
		return new User(auth.getMail(),auth.getPassword(), new ArrayList<>());
	}
	
	
	

}
