package com.example.admin.login.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name = "admin")
@Entity
public class Admin {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long AdminId;
	
	
	@Column(name = "username")
	private String username;
	
	@Column(name = "password")
	private String password;
	
	public Long getAdminId() {
		return AdminId;
	}
	public void setAdminId(Long adminId) {
		AdminId = adminId;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public Admin(String username, String password, Long AdminId) {
		super();
		this.AdminId = AdminId;
		this.username = username;
		this.password = password;
	}
	public Admin() {
		super();
	}
	
	
	

}
