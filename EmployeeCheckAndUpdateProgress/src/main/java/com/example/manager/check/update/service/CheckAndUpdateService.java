package com.example.manager.check.update.service;

import java.util.List;

import com.example.manager.check.update.model.Tasks;

public interface CheckAndUpdateService {
	
	

	Tasks updateTaskStatus( String employeeMail);	
	
	List<Tasks> checkTasks(String employeeMail);
}
