package com.example.admin.login;


import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.admin.login.model.Employee;
import com.example.admin.login.repository.EmployeeRepository;



@SpringBootTest
//@ExtendWith(MockitoExtension.class)
public class AdminLoginMicroservicesApplicationTests {
	

	@Autowired
	private EmployeeRepository employeeRepo;
	
	

	
	//Checking whether employee with mail exists or not
	@Test
	void findByEmployeeMail() {
		//String email = "bharath@gmail.com";
		String email = "bharath@gmail.com";
		Employee employee = employeeRepo.findByEmployeeMail(email);
		assertNotNull(employee);
	}
	

	
	
	
	
	

}
