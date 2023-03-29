package com.example.manager.check.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.manager.check.model.Employee;
//import com.example.manager.check.repository.ManagerLoginRepository;
import com.example.manager.check.repository.ManagerRepo;
import com.example.manager.check.service.ManagerLoginService;


@Service
public class ManagerLoginServiceImpl implements ManagerLoginService{
	
	@Autowired
	private ManagerRepo repo;

//	public ManagerLoginServiceImpl(ManagerLoginRepository repo) {
//		super();
//		this.repo = repo;
//	}



	@Override
	public List<Employee> getAllEmployeesOfManager(String mail) {
		return repo.findByMail(mail);
		
	}

}
