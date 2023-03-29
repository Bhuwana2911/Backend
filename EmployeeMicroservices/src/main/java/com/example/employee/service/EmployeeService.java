package com.example.employee.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.example.employee.repository.EmployeeRepository;


@Service
public class EmployeeService implements UserDetailsService{

	@Autowired
	private EmployeeRepository employeeRepository;
	
	@Override
	public UserDetails loadUserByUsername(String employee_mail) throws UsernameNotFoundException {		
		UserDetails userDetails = employeeRepository.loadByusername(employee_mail);
		if(userDetails == null) {
			throw new UsernameNotFoundException("Employee not found");
		}
		
		return userDetails;
	}
	

}
