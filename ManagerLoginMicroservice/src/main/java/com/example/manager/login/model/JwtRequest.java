package com.example.manager.login.model;

import java.io.Serializable;

public class JwtRequest implements Serializable{

	private String mail;
	private String password;
	public String getMail() {
		return mail;
	}
	public void setMail(String mail) {
		this.mail = mail;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public JwtRequest(String mail, String password) {
		super();
		this.mail = mail;
		this.password = password;
	}
	public JwtRequest() {
		super();
	}
	

}

