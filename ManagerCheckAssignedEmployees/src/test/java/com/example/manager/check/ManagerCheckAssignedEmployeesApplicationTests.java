package com.example.manager.check;

import static io.restassured.RestAssured.given;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import io.restassured.http.ContentType;

@SpringBootTest
class ManagerCheckAssignedEmployeesApplicationTests {

	
	@Test
	void checkTasksTest() {
		given().header("content_Type", "application/json").contentType(ContentType.JSON)
		.accept(ContentType.JSON)
		.when()
		.get("http://localhost:9508/checkAndupdate/tasks/sai@gmail.com")
		.then()
		.assertThat().statusCode(200);	
	}

}
