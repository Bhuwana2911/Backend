package com.example.admin.login.exception;

import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.http.HttpStatus;

@ResponseStatus(HttpStatus.NOT_FOUND)

public class CustomException extends RuntimeException{
	private String resourceName;
	private String fieldName;
	private Object fieldValue;
	
	
	public CustomException(String resourceName, String fieldName, Object fieldValue) {
		
		super(String.format("%s is  found with %s : '%s'", resourceName, fieldName, fieldValue));
		this.resourceName = resourceName;
		this.fieldName = fieldName;
		this.fieldValue = fieldValue;
		System.out.println(resourceName + " with " + fieldName + " " + fieldValue + " already exists");
	}


	public String getResourseName() {
		return resourceName;
	}


	public String getFieldName() {
		return fieldName;
	}


	public Object getFieldValue() {
		return fieldValue;
	}
	

}
