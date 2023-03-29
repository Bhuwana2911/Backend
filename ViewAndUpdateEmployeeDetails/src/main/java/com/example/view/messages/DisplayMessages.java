package com.example.view.messages;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

public class DisplayMessages {
	String msg = "";
	
	public static final String  DATA_PRESENT = "Data with {msg} already exists";
	
	public static final String  DATA_ABSENT = "Data with {msg} does not exists";
	
	
	private DisplayMessages() {
		
	}
	
	public  static ResponseEntity<String> getResponseEntity(String responseMessage, HttpStatus httpStatus){
		return new ResponseEntity<String> ("{\"message\":\"" + responseMessage+"\"}", httpStatus);
	}
	

}
