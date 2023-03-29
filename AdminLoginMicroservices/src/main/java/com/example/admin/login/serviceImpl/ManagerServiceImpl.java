package com.example.admin.login.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.admin.login.exception.CustomException;
import com.example.admin.login.model.Manager;
import com.example.admin.login.repository.ManagerRepository;
import com.example.admin.login.service.ManagerService;


@Service
public class ManagerServiceImpl implements ManagerService{
	
	@Autowired
	private ManagerRepository repo;
	

	public ManagerServiceImpl(ManagerRepository repo) {
		super();
		this.repo = repo;
	}
	@Override
	public Manager saveManager(Manager manager) {
		Manager manage = repo.findByMail(manager.getMail());
		Manager manage1 = repo.findByMid(manager.getMid());
		if(manage != null ) {
			System.out.println("Manager already exists");
			throw new CustomException("Manager", "Manager mail", manager.getMail());
		}
		else if(manage1 != null) {
			System.out.println("Manager with manager id already exists");
			throw new CustomException("Manager", "Manager id", manager.getMid());
		}
		return repo.save(manager);
	}
	
	@Override
	public List<Manager> getAllManagers() {
		return repo.findAll();
	}
	
	@Override
	public Manager getManagerByMail(String mail) {
		Manager exists = repo.findByMail(mail);
		if(exists == null) {
			System.out.println("No manager with " + mail);
		}
		return exists;
	}

}
