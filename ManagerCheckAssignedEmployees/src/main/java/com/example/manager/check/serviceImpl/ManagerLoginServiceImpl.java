package com.example.manager.check.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.manager.check.model.Employee;
import com.example.manager.check.model.Manager;
import com.example.manager.check.repository.ManagerLoginRepository;
//import com.example.manager.check.repository.ManagerLoginRepository;
import com.example.manager.check.repository.ManagerRepo;
import com.example.manager.check.service.ManagerLoginService;


@Service
public class ManagerLoginServiceImpl implements ManagerLoginService{
	
	@Autowired
	private ManagerRepo repo;
	
	@Autowired
	private ManagerLoginRepository repo1;

//	public ManagerLoginServiceImpl(ManagerLoginRepository repo) {
//		super();
//		this.repo = repo;
//	}



	@Override
	public List<Employee> getAllEmployeesOfManager(String mail) {
		Manager m = repo1.findByMail(mail);
//		try {
			if(m == null) {
				throw new RuntimeException("No manager with " + mail + " exists");
			}
			
//		}
//		catch(Exception e) {
//			System.out.println(e);;
//		}
		
		return repo.findByMail(mail);
		
	}

}
