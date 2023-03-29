package com.example.manager.assign.tasks.serviceImpl;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import com.example.manager.assign.tasks.model.Employee;
import com.example.manager.assign.tasks.model.Tasks;
import com.example.manager.assign.tasks.model.Tasks.TaskStatus;
import com.example.manager.assign.tasks.repository.TasksRepo;
import com.example.manager.assign.tasks.repository.TasksRepository;
import com.example.manager.assign.tasks.service.TasksService;

@Service
public class TasksServiceImpl implements TasksService{



	@Autowired
	private TasksRepository tasksRepository;
	
	@Autowired
	private TasksRepo repo;

	public TasksServiceImpl(TasksRepository tasksRepository) {
		super();
		this.tasksRepository = tasksRepository;
	}	


	@Override
	public Tasks assignTasks(Tasks task) {		
		task.setTstatus(TaskStatus.Assigned.name());
		return tasksRepository.save(task);
	}


	@Override
	public List<Tasks> allTasksOfEmployee(Tasks task, String employeeMail) {
		List<Tasks> t = repo.findByEmployeeMail(employeeMail);
		if(t == null) {
			System.out.println("No tasks are assigned");
		}
		
		return t;
	}
	
	
	


}
