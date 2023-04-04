package com.example.admin.login.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.admin.login.model.Employee;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long>{
	Employee findByEmployeeMail(String employeeEmail);
	Employee findByEmployeeId(Long employeeId);
	Employee findByMail(String mail);
	

}
