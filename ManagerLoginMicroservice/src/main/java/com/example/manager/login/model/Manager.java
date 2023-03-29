package com.example.manager.login.model;

import javax.persistence.Entity;


public class Manager {
	
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
	public Manager(String mail, String password) {
		super();
		this.mail = mail;
		this.password = password;
	}
	public Manager() {
		super();
	}
}
	