package com.example.admin.login.service;

import java.util.ArrayList;

import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.example.admin.login.model.Admin;
import com.example.admin.login.model.Employee;


@Service
public class AdminService implements UserDetailsService{

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {	
		if(username.equals("admin")) {
			return new User("admin", "Admin@123", new ArrayList<>());
		}
		else {
			throw new UsernameNotFoundException("User not found");
		}
		
		
//		Admin admin = new Admin();
//		if(admin.getUsername().equals(username)) {
//			return new User(username, admin.getPassword(), new ArrayList<>());
//		}
//		else {
//			throw new UsernameNotFoundException("User not found");
//		}
//	
//	
	}

}
