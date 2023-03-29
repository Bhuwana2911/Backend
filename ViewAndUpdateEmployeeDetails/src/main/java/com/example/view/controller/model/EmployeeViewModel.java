package com.example.view.controller.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;



@Entity
@Table(name = "employee")
public class EmployeeViewModel {
	
	@NotNull(message="id")
	@Column(name = "Id")
	private Long employeeId;
	
	@NotNull
	@Column(name = "name")
	private String employeeName;	
	
	@Id	
	@Email
	@NotNull(message="mail")
	private String employeeMail;	
	
	@NotNull(message="dept")
	@Column(name = "department")
	private String employeeDepartment;
	
	@NotNull(message="role")
	@Column(name = "role")
	private String employeeRole;

	
	@NotNull(message="password")
	@Column(name = "password")
	private String employeePassword;
	
	@NotNull
	@Column(name = "mobile")
	private String employeeMobile;
	
	@NotNull
	@Column(name = "gender")
	private String employeeGender;
	
//	@Column(name = "age")
//	private int employeeAge;
//	
	@NotNull
	@Column(name = "address")
	private String address;
	
	
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

//	public int getEmployeeAge() {
//		return employeeAge;
//	}
//
//	public void setEmployeeAge(int employeeAge) {
//		this.employeeAge = employeeAge;
//	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}
	
	
	private String mail;
	
	

	
	public String getMail() {
		return mail;
	}

	public void setMail(String mail) {
		this.mail = mail;
	}

	

	public EmployeeViewModel(@NotNull(message = "id") Long employeeId, String employeeName,
			@Email @NotNull(message = "mail") String employeeMail, @NotNull(message = "dept") String employeeDepartment,
			@NotNull(message = "role") String employeeRole, @NotNull(message = "password") String employeePassword,
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

	public EmployeeViewModel() {
		super();
	}
	
	
	

}
