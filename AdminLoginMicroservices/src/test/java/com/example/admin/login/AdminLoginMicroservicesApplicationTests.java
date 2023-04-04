package com.example.admin.login;

import static io.restassured.RestAssured.given;
import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import com.example.admin.login.model.Employee;
import com.example.admin.login.model.Manager;
import com.example.admin.login.repository.EmployeeRepository;
import com.example.admin.login.serviceImpl.EmployeeServiceImpl;

import io.restassured.http.ContentType;



@SpringBootTest
public class AdminLoginMicroservicesApplicationTests {
	

	
	
	@Autowired
	private EmployeeRepository employeeRepo;	
	
//	@MockBean
//	private EmployeeRepository employeeRepoMock;
	
	@MockBean
	private EmployeeServiceImpl service;

	
	//Checking whether employee with mail exists or not
	@Test
	@Order(1)
	void findByEmployeeMail() {
		//String email = "bharath@gmail.com";
		String email = "bharath@gmail.com";
		Employee employee = employeeRepo.findByEmployeeMail(email);
		assertNotNull(employee);
	}
	
	
	//Testing Post employee details
	@Test
	@Order(2)
	void postEmployee() {
		
		Employee emp = new Employee(20230108L,"Hogwarts","Java",
				"male","ron@gmail.com","9086754123","Ron","password","Developer","Hari@manager.com");
		when(employeeRepo.save(emp)).thenReturn(emp);
		assertEquals(emp,service.saveEmployee(emp));
		
	   }
	
     	
	//Testing manager post details
	@Test
	@Order(3)
	void postManager() {
	
		
	}
//	
	
//	@Test
	
	

	
	
	
	
	

}
