package com.example.manager.check.update;

import static io.restassured.RestAssured.given;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import io.restassured.http.ContentType;

@SpringBootTest
class EmployeeCheckAndUpdateProgressApplicationTests {

	
	//Test -- all tasks of employee
	@Test
	void checkTasksTest() {
		given().header("content_Type", "application/json").contentType(ContentType.JSON)
		.accept(ContentType.JSON)
		.when()
		.get("http://localhost:9508/checkAndupdate/tasks/sai@gmail.com")
		.then()
		.assertThat().statusCode(200);	
	}
	
	
    //Test --- to update the task progress(id with 50 does not exists throws internal server error)
	@Test
	void updateTaskProgressTest() {
		
		given().header("content_Type", "application/json").contentType(ContentType.JSON)
		.accept(ContentType.JSON)
		.when()
		.put("http://localhost:9508/checkAndupdate/progress/50")
		.then()
		.assertThat().statusCode(500);	
	}
	
	 //Test --- to update the task progress(id with 4 exists)
		@Test
		void updateTaskProgressTest1() {
			
			given().header("content_Type", "application/json").contentType(ContentType.JSON)
			.accept(ContentType.JSON)
			.when()
			.put("http://localhost:9508/checkAndupdate/progress/4")
			.then()
			.assertThat().statusCode(200);	
		}
}
