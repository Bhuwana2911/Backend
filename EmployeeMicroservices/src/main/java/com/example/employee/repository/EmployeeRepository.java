package com.example.employee.repository;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.security.core.userdetails.User;
//import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;


import com.example.employee.model.JwtRequest;


@Repository
public class EmployeeRepository {
	
	@Autowired
	private JdbcTemplate template;
	public UserDetails loadByusername(String employee_mail) {		
		String query = "select * from employee where employee_mail=?";		
		JwtRequest auth = template.queryForObject(query, new Object[] {employee_mail}, new AuthenticationMapper());
		
			
		return new User(auth.getEmployee_mail(),auth.getPassword(), new ArrayList<>());
	}
	
	
	

}
