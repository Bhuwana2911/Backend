package com.example.view.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import com.example.view.controller.model.EmployeeViewModel;
import com.example.view.messages.DisplayMessages;
import com.example.view.repository.EmployeeViewRepository;
import com.example.view.service.EmployeeViewService;

@Service
public class EmployeeViewServiceImpl implements EmployeeViewService{

	@Autowired
	private EmployeeViewRepository viewRepo;
	
	
	public EmployeeViewServiceImpl(EmployeeViewRepository viewRepo) {
		super();
		this.viewRepo = viewRepo;
	}


	@Override
	public EmployeeViewModel getEmployeeByEmployeeMail(String employeeMail) {
		
		EmployeeViewModel empMail = viewRepo.findByEmployeeMail(employeeMail);
		
		return empMail;
		
		
		
	}



	

		
	
}
