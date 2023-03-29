package com.example.admin.login.model;

import java.io.Serializable;

public class JwtResponse implements Serializable{
	
	 private final String jwtToken;

	public String getJwtToken() {
		return jwtToken;
	}
	public JwtResponse(String jwtToken) {
		this.jwtToken = jwtToken;
	}
	 
	

}
