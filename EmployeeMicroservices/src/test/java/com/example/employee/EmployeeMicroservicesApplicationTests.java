package com.example.employee;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.TestMethodOrder;
import org.junit.jupiter.api.MethodOrderer;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.employee.model.JwtRequest;

import io.restassured.http.ContentType;
import static io.restassured.RestAssured.*;


@SpringBootTest
class EmployeeMicroservicesApplicationTests {
	
	
	@Test
	void EmployeeLoginTest() {		
		JwtRequest logincheck = new JwtRequest();
		logincheck.setEmployee_mail("praneetha@gmail.com");
		logincheck.setPassword("passwor");		
		given().header("content_Type", "application/json").contentType(ContentType.JSON)
		.accept(ContentType.JSON)
		.body(logincheck)
		.when()
		.post("http://localhost:9501/token")
		.then()
		.assertThat().statusCode(200);		
	}
	
	
	

	

}
