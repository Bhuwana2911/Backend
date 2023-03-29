package com.example.admin.login.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "employee")
public class Employee {
	
	//@Id
	//@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "Id")
	private Long employeeId;
	
	@Column(name = "name")
	private String employeeName;	
	
	@Id	
	private String employeeMail;	
	
	
	@Column(name = "department")
	private String employeeDepartment;
	
	
	@Column(name = "role")
	private String employeeRole;

	@Column(name = "password")
	private static String password;
	
	
	@Column(name = "password")
	private String employeePassword;
	
	@Column(name = "mobile")
	private String employeeMobile;
	
	@Column(name = "gender")
	private String employeeGender;
	
	@Column(name = "age")
	private int employeeAge;
	
	@Column(name = "address")
	private String address;


	public Employee(Long employeeId, String employeeName, String employeeMail, String employeeDepartment,
			String employeeRole) {
		super();
		this.employeeId = employeeId;
		this.employeeName = employeeName;
		this.employeeMail = employeeMail;
		this.employeeDepartment = employeeDepartment;
		this.employeeRole = employeeRole;
	}

	public Long getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(Long employeeId) {
		this.employeeId = employeeId;
	}

	public String getEmployeeName() {
		return employeeName;
	}

	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}

	public String getEmployeeMail() {
		return employeeMail;
	}

	public void setEmployeeMail(String employeeMail) {
		this.employeeMail = employeeMail;
	}

	public String getEmployeeDepartment() {
		return employeeDepartment;
	}

	public void setEmployeeDepartment(String employeeDepartment) {
		this.employeeDepartment = employeeDepartment;
	}

	public String getEmployeeRole() {
		return employeeRole;
	}

	public void setEmployeeRole(String employeeRole) {
		this.employeeRole = employeeRole;
	}

	public static String getPassword() {
		return password;
	}

	public static void setPassword(String password) {
		Employee.password = password;
	}
	
	public Employee() {
		
	}
	
	
	}