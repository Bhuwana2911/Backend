package com.example.manager.check.update.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;


import com.example.manager.check.update.model.Tasks;


@Repository
public class CheckAndUpdateRepo {
	
	@Autowired
	private JdbcTemplate template;
	
	String sql = "select * from tasks where employee_mail = ?";
	public List<Tasks> findByEmployeeMail(String employee_mail){
		List<Tasks> t =  template.query(sql, new Object[] {employee_mail} , new AuthenticationMapper());
		return  t;
		
	}

}
