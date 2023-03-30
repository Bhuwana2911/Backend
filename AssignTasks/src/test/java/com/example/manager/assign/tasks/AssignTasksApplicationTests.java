package com.example.manager.assign.tasks;

import static io.restassured.RestAssured.given;

import java.time.LocalDate;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;


import com.example.manager.assign.tasks.model.Tasks;

import io.restassured.http.ContentType;

@SpringBootTest
class AssignTasksApplicationTests {

	
	//Test for assigning tasks
	@Test
	void postTasksTest() {
		Tasks t = new Tasks();
		t.setEmployeeMail("sai@gmail.com");
		t.setDescription("Second task");
		t.setDeadline(LocalDate.now());
		t.setMail("Renuka@manager.com");
		//t.setId(null);
		
//		r.save(l);
		given().header("content_Type", "application/json").contentType(ContentType.JSON)
		.accept(ContentType.JSON)
		.body(t)
		.when()
		.post("http://localhost:9507/task/assign")
		.then()
		.assertThat().statusCode(200);	
	}
	
	
	
	//Test to check task status by manager
	@Test
	void getLeaveStatus() {
		given().header("content_Type", "application/json").contentType(ContentType.JSON)
		.accept(ContentType.JSON)
		.when()
		.get("http://localhost:9507/task/4")
		.then()
		.assertThat().statusCode(200);	
	}
	
	@Test
	void getAllTasksOfEmployes() {
		given().header("content_Type", "application/json").contentType(ContentType.JSON)
		.accept(ContentType.JSON)
		.when()
		.get("http://localhost:9507/task/listofemployeetasks/sai@gmail.com")
		.then()
		.assertThat().statusCode(200);	
	}
	

}
