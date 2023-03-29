package com.example.manager.login.model;

import java.io.Serializable;

import org.springframework.beans.factory.annotation.Autowired;



public class JwtResponse implements Serializable{
	
	 private final String jwtToken;

	public String getJwtToken() {
		return jwtToken;
	}

	

	public JwtResponse(String jwtToken) {
		this.jwtToken = jwtToken;
	}
	 
	

}



	
	 
