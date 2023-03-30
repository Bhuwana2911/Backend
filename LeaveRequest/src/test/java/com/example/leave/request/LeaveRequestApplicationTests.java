package com.example.leave.request;

import static io.restassured.RestAssured.given;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Date;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.leave.request.model.LeaveRequest;
import com.example.leave.request.repository.LeaveRequestRepository;

import io.restassured.http.ContentType;
import lombok.var;

@SpringBootTest
class LeaveRequestApplicationTests {

	
	
	@Test
	void postLeaveRequestTest() {
		LeaveRequest l = new LeaveRequest();
		
		l.setEmployeeMail("sai@gmail.com");
		l.setMail("Renuka@manager.com");
		l.setReason("Medical visit");
		l.setSdate(null);
		l.setEdate(null);
		
		given().header("content_Type", "application/json").contentType(ContentType.JSON)
		.accept(ContentType.JSON)
		.when()
		.post("http://localhost:9505/leave/request")
		.then()
		.assertThat().statusCode(200);	
		
		
	}
	
	
	//Test for all the leave requests
	@Test
	void getAllLeavesOfEmployeeTest() {
		given().header("content_Type", "application/json").contentType(ContentType.JSON)
		.accept(ContentType.JSON)
		.when()
		.get("http://localhost:9505/leave/leaves/bhuwaneshwari@gmail.com")
		.then()
		.assertThat().statusCode(200);	
	}
	
	
	@Test
	void getLeaveStatusTest() {
		given().header("content_Type", "application/json").contentType(ContentType.JSON)
		.accept(ContentType.JSON)
		.when()
		.get("http://localhost:9505/leave/status/praneetha@gmail.com")
		.then()
		.assertThat().statusCode(200);	
	}
	
	

}
