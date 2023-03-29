package com.example.employee.model;

import java.io.Serializable;

public class JwtRequest implements Serializable{

	private String employee_mail;
	private String password;
	
	public String getEmployee_mail() {
		return employee_mail;
	}
	public void setEmployee_mail(String employee_mail) {
		this.employee_mail = employee_mail;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public JwtRequest() {
		
	}
	public JwtRequest(String employee_mail, String password) {
		super();
		this.employee_mail = employee_mail;
		this.password = password;
	}

	
	



	





}

