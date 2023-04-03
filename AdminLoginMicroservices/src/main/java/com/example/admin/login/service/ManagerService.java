package com.example.admin.login.service;

import java.util.List;

import com.example.admin.login.model.Manager;

public interface ManagerService {
	
	Manager saveManager(Manager manager);
	
	List<Manager> getAllManagers();
	
	Manager getManagerByMail(String mail);
	
//	Manager getManagerDetails(String mail);
	

}
