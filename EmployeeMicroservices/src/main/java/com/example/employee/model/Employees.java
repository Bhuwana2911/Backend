package com.example.employee.model;

public class Employees {
	
	private String employee_mail;
	private String password;
	public Employees(String employee_mail, String password) {
		super();
		this.employee_mail = employee_mail;
		this.password = password;
	}
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
	
	
}