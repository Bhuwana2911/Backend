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
@Table(name = "manager")
public class Manager {
	
	@NotNull
	@Id
	@Email
	private String mail;
	
	@NotNull
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column
	private String mid;
	
	@NotNull
	@Column
	private String mname;
	
	@NotNull
	@Column
	private String mrole;
	
	
	@NotNull
	@Column
	private String password;


	public String getMail() {
		return mail;
	}


	public void setMail(String mail) {
		this.mail = mail;
	}


	public String getMid() {
		return mid;
	}


	public void setMid(String mid) {
		this.mid = mid;
	}


	public String getMname() {
		return mname;
	}


	public void setMname(String mname) {
		this.mname = mname;
	}


	public String getMrole() {
		return mrole;
	}


	public void setMrole(String mrole) {
		this.mrole = mrole;
	}


	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}


	public Manager(@Email @NotNull String mail, String mid, String mname, String mrole, String password) {
		super();
		this.mail = mail;
		this.mid = mid;
		this.mname = mname;
		this.mrole = mrole;
		this.password = password;
	}


	public Manager() {
		super();
	}
	
	
	
}
	


	