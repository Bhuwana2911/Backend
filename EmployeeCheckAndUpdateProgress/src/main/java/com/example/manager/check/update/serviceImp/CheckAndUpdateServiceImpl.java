package com.example.manager.check.update.serviceImp;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.manager.check.update.model.Tasks;
import com.example.manager.check.update.model.Tasks.TaskStatus;
import com.example.manager.check.update.repository.CheckAndUpdateRepo;
import com.example.manager.check.update.repository.CheckAndUpdateRepository;
import com.example.manager.check.update.service.CheckAndUpdateService;

@Service
public class CheckAndUpdateServiceImpl implements CheckAndUpdateService{

	
	
	@Autowired
	private CheckAndUpdateRepository repository;
	
	public CheckAndUpdateServiceImpl(CheckAndUpdateRepository repository) {
		super();
		this.repository = repository;
	}
	
	@Autowired
	private CheckAndUpdateRepo repo;
	
	



	@Override
	public List<Tasks> checkTasks(String employeeMail) {
//		Tasks emp = repository.findByEmployeeMail(employeeMail);
//		try {
//			if(emp == null) {
//				throw new RuntimeException("No tasks assigned for employee");
//			}
//		}
//		catch(RuntimeException e) {
//			e.printStackTrace();
//		}
		
		return repo.findByEmployeeMail(employeeMail);
	}



	@Override
	public Tasks updateTaskStatus(String id) {

		Tasks exists = repository.findById(id);
		
		if(exists != null) {		
		if(LocalDate.now().isBefore(exists.getDeadline())) {
			exists.setEprogress(TaskStatus.Completed.name());
			//exists.setSubmissiondate(LocalDate.now());	
		}
		
		else if(LocalDate.now().equals(exists.getDeadline())) {
			exists.setEprogress(TaskStatus.InProgress.name());
			exists.setSubmissiondate(LocalDate.now());
		}
		
		else if(LocalDate.now().isAfter(exists.getDeadline())) {
			exists.setEprogress(TaskStatus.Blocked.name());
			exists.setDeadline(exists.getDeadline());
			exists.setSubmissiondate(LocalDate.now());
		}
		}

		return repository.save(exists);
	}



	
	

}
