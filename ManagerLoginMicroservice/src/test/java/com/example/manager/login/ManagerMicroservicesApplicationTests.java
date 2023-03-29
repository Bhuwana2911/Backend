package com.example.manager.login;

import static io.restassured.RestAssured.given;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;

import com.example.manager.login.model.JwtRequest;
import io.restassured.http.ContentType;


@SpringBootTest
@ContextConfiguration
public class ManagerMicroservicesApplicationTests {
	
	@Test
	void ManagerLoginTest() {		
		JwtRequest logincheck = new JwtRequest();
		logincheck.setMail("Narayana@manager.com");
		logincheck.setPassword("password");		
		given().header("content_Type", "application/json").contentType(ContentType.JSON)
		.accept(ContentType.JSON)
		.body(logincheck)
		.when()
		.post("http://localhost:9504/token")
		.then()
		.assertThat().statusCode(200);		
	}

}
