package com.example.manager.check.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.example.manager.check.model.Employee;


@Repository
public class ManagerRepo {
	
	@Autowired
	private JdbcTemplate template;
	
	String sql = "select * from employee e ,manager m where e.mail=m.mail and m.mail=?";
	public List<Employee> findByMail(String mail){
		List<Employee> emp =  template.query(sql, new Object[] {mail} , new AuthenticationMapper());
		return  emp;
		
	}
	
	
	

}
