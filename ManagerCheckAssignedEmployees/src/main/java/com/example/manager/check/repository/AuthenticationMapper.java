package com.example.manager.check.repository;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.example.manager.check.model.Employee;

public class AuthenticationMapper implements RowMapper<Employee>{

	@Override
	public Employee mapRow(ResultSet rs, int rowNum) throws SQLException {
		// TODO Auto-generated method stub
		
		Employee emp = new Employee();		
		emp.setMail(rs.getString("mail"));
		emp.setEmployeeId(rs.getLong("id"));
		emp.setEmployeeName(rs.getString("name"));
		emp.setEmployeeMail(rs.getString("employee_mail"));
		emp.setEmployeeDepartment(rs.getString(("department")));
		emp.setEmployeeRole(rs.getString("role"));
		emp.setEmployeeMobile(rs.getString("mobile"));
		emp.setEmployeeGender(rs.getString("gender"));
		emp.setAddress(rs.getString("address"));
		return emp;
	}

	
	

}
