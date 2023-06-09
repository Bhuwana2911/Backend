package com.example.manager.assign.tasks.repository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.example.manager.assign.tasks.model.Tasks;




@Repository
public class TasksRepo {
	
	@Autowired
	private JdbcTemplate template;
	
	String sql = "select * from tasks  where  "
			+ "employee_mail = ?";	
	public List<Tasks> findByEmployeeMail(String employeeMail) {
	    List<Tasks> t = template.query(sql, new Object[] {employeeMail}, new Mapper());		
		return t;
	}
	

}
