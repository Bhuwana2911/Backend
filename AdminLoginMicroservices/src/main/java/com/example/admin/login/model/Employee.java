package com.example.admin.login.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "employee")
public class Employee {
	
	@NotNull
	@Column(name = "Id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long employeeId;
	
	@NotNull
	@Column(name = "name")
	private String employeeName;	
	
	@Id	
	@Email
	@NotNull
	private String employeeMail;	
	
	@NotNull
	@Column(name = "department")
	private String employeeDepartment;
	
	@NotNull
	@Column(name = "role")
	private String employeeRole;

//	@NotNull
	@Column(name = "password")
	private String employeePassword;
	
//	@NotNull
	@Column(name = "mobile")
	private String employeeMobile;
	
//	@NotNull
	@Column(name = "gender")
	private String employeeGender;
	
	
//	@NotNull
	@Column(name = "address")
	private String address;
	
	
	@NotNull
	private String mail;


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

	

	public String getEmployeePassword() {
		return employeePassword;
	}

	public void setEmployeePassword(String employeePassword) {
		this.employeePassword = employeePassword;
	}

	public String getEmployeeMobile() {
		return employeeMobile;
	}

	public void setEmployeeMobile(String employeeMobile) {
		this.employeeMobile = employeeMobile;
	}

	public String getEmployeeGender() {
		return employeeGender;
	}

	public void setEmployeeGender(String employeeGender) {
		this.employeeGender = employeeGender;
	}

	
	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}
	

	public String getMail() {
		return mail;
	}

	public void setMail(String mail) {
		this.mail = mail;
	}

	
	
	
	
	



	public Employee(@NotNull Long employeeId, String employeeName, @Email @NotNull String employeeMail,
			@NotNull String employeeDepartment, @NotNull String employeeRole, String employeePassword,
			String employeeMobile, String employeeGender, String address, String mail) {
		super();
		this.employeeId = employeeId;
		this.employeeName = employeeName;
		this.employeeMail = employeeMail;
		this.employeeDepartment = employeeDepartment;
		this.employeeRole = employeeRole;
		this.employeePassword = employeePassword;
		this.employeeMobile = employeeMobile;
		this.employeeGender = employeeGender;
		
		this.address = address;
		this.mail = mail;
	}
	
	

	public Employee() {
		super();
	}

	
	

}
