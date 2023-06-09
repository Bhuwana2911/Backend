package com.example.manager.check.update.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.manager.check.update.model.Tasks;

@Repository
public interface CheckAndUpdateRepository extends JpaRepository<Tasks, Long>{
	Tasks findByEmployeeMail(String employeeMail);
	Tasks findById(String id);

}
