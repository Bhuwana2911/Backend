package com.example.admin.login.messages;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

public class DisplayMessages {
	
	public static String  EMPTY_STRING = "";
	
	public static final String  DATA_PRESENT = "Data with already exists";
	
	public static final String  DATA_ABSENT = "Data with does not exists";
	
	
	private DisplayMessages() {
		
	}
	
	public  static ResponseEntity<String> getResponseEntity(String responseMessage, HttpStatus httpStatus){
		return new ResponseEntity<String> ("{\"message\":\"" + responseMessage+"\"}", httpStatus);
	}
	

}
