package com.example.manager.assign.tasks.service;

import java.util.List;

import org.springframework.stereotype.Repository;


import com.example.manager.assign.tasks.model.Tasks;
import com.example.manager.assign.tasks.model.Tasks.TaskStatus;

@Repository
public interface TasksService {
	
	Tasks assignTasks(Tasks task);	 
	List<Tasks> allTasksOfEmployee(Tasks task, String employeeMail);
	
	
	
	
	
	
	
	
	
	
	

}
