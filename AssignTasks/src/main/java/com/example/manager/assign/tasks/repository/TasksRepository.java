package com.example.manager.assign.tasks.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.manager.assign.tasks.model.Employee;
import com.example.manager.assign.tasks.model.Tasks;


@Repository
public interface TasksRepository extends JpaRepository<Tasks, Long>{
	
	Tasks findByEmployeeMail(Tasks task);
	Tasks findById(String id);
	boolean findByEmployeeMail(Object setEmployeeMail);
	Tasks findByMail(String mail);
	
	
}
