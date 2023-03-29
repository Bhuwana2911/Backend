package com.example.manager.assign.tasks.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.manager.assign.tasks.model.Employee;
import com.example.manager.assign.tasks.model.Tasks;

import com.example.manager.assign.tasks.repository.TasksRepository;
import com.example.manager.assign.tasks.service.TasksService;

@RestController
@RequestMapping("/task")
@CrossOrigin("http://localhost:3000")
public class TasksController {

	@Autowired
	private TasksService service;

	@Autowired
	private TasksRepository repo;
	
	public TasksController(TasksService service) {
		super();
		this.service = service;
	}



	@PostMapping("/assign")
	public ResponseEntity<Tasks> assignTasks(@RequestBody Tasks t) {		
		return new ResponseEntity<Tasks>(service.assignTasks(t), HttpStatus.OK);	
	}


	@GetMapping("/{id}")
	public String getStatus(@PathVariable("id") String id) {
		Tasks status_check = repo.findById(id);
		
		if(!(status_check.getId().equals(id))){
			return "No task assigned to employee";
		}
		String status = status_check.getEprogress();
		return status;
	}
	
	
	@GetMapping("/listofemployeetasks/{employeeMail}")
	public List<Tasks> getAllEmployeesOfManager(@PathVariable("employeeMail") String employeeMail,
			 Tasks t){
		return service.allTasksOfEmployee(t, employeeMail);
		
	}
	
	



}
