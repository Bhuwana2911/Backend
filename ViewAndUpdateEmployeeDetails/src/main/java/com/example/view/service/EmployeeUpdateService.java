package com.example.view.service;

import com.example.view.controller.model.EmployeeViewModel;

public interface EmployeeUpdateService {
	
	EmployeeViewModel updateEmployeeByEmployeeMail(EmployeeViewModel emp, String employeeMail);

	//EmployeeViewModel saveEmployee(EmployeeViewModel emp);
	
	//EmployeeViewModel updateDetails(EmployeeViewModel emp);
	
}
