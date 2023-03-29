package com.example.view.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.view.controller.model.EmployeeViewModel;

@Repository
public interface EmployeeViewRepository extends JpaRepository<EmployeeViewModel, String>{
	
	@Query(value = "select * from employee where employee_mail = ?", nativeQuery = true)
	EmployeeViewModel findByEmployeeMail(String employeeMail);	
	EmployeeViewModel findByMail(String mail);

}
