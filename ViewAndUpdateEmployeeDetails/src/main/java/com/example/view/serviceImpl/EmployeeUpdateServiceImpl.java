package com.example.view.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.view.controller.model.EmployeeViewModel;
import com.example.view.repository.EmployeeUpdateRepository;
import com.example.view.service.EmployeeUpdateService;


@Service
public class EmployeeUpdateServiceImpl implements EmployeeUpdateService{

	@Autowired
	private EmployeeUpdateRepository updateRepo;

//	@Override
//	public EmployeeViewModel updateDetails(EmployeeViewModel emp) {
//
//		EmployeeViewModel existsEmployee = updateRepo.findByEmployeeMail(emp.getEmployeeMail());
//
//
//        
//		existsEmployee.setEmployeeGender(emp.getEmployeeGender());
//		existsEmployee.setEmployeeMobile(emp.getEmployeeMobile());
//		existsEmployee.setEmployeeName(emp.getEmployeeName());
//		existsEmployee.setEmployeePassword(emp.getEmployeePassword());
//		existsEmployee.setAddress(emp.getAddress());
//		return updateRepo.save(existsEmployee);
//
//
//	}	



		@Override
		public EmployeeViewModel updateEmployeeByEmployeeMail(EmployeeViewModel emp, String employeeMail) {
	
			EmployeeViewModel existsEmployee = updateRepo.findByEmployeeMail(employeeMail);
	 
			
			if(existsEmployee != null) {
				existsEmployee.setEmployeeGender(emp.getEmployeeGender());
				existsEmployee.setEmployeeMobile(emp.getEmployeeMobile());
				existsEmployee.setEmployeeName(emp.getEmployeeName());
				existsEmployee.setEmployeePassword(emp.getEmployeePassword());
				existsEmployee.setAddress(emp.getAddress());
			}
			else {
				System.out.println("Not exists");
			}
	
			return updateRepo.save(existsEmployee);
		}




}
