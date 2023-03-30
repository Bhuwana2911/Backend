package com.example.manager.accept.reject;

import static io.restassured.RestAssured.given;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import io.restassured.http.ContentType;

@SpringBootTest
class AccceptRejecetLeaveApplicationTests {



	//Test for to get all requests of that manager
	@Test
	void getAllLeavesTest() {
		given().header("content_Type", "application/json").contentType(ContentType.JSON)
		.accept(ContentType.JSON)
		.when()
		.get("http://localhost:9506/ar/Narayana@manager.com")
		.then()
		.assertThat().statusCode(200);	
	}



	//Test to accept the leave
	@Test
	void acceptLeave() {
		given().header("content_Type", "application/json").contentType(ContentType.JSON)
		.accept(ContentType.JSON)
		.when()
		.put("http://localhost:9506/ar/accept/praneetha@gmail.com")
		.then()
		.assertThat().statusCode(200);	
	}
	
	//Test to reject the leave
		@Test
		void rejectLeave() {
			
			given().header("content_Type", "application/json").contentType(ContentType.JSON)
			.accept(ContentType.JSON)
			.when()
			.put("http://localhost:9506/ar/reject/praneetha@gmail.com")
			.then()
			.assertThat().statusCode(200);	
		}


}
