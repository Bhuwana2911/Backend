package com.example.view.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.view.controller.model.EmployeeViewModel;

public interface EmployeeUpdateRepository extends JpaRepository<EmployeeViewModel, Long>{
	
	EmployeeViewModel findByEmployeeMail(String employeeMail);

}
