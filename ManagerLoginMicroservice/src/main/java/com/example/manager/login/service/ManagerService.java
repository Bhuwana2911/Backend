package com.example.manager.login.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.example.manager.login.repository.ManagerRepository;


@Service
public class ManagerService implements UserDetailsService{

	@Autowired
	private ManagerRepository managerRepository;
	
	@Override
	public UserDetails loadUserByUsername(String mail) throws UsernameNotFoundException {
		
		UserDetails userDetails = managerRepository.loadByusername(mail);
		if(userDetails == null) {
			throw new UsernameNotFoundException("Manager not found");
		}
		
		return userDetails;
	}
	

}
