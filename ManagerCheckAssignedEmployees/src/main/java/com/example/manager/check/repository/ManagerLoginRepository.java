package com.example.manager.check.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.manager.check.model.Employee;
import com.example.manager.check.model.Manager;

@Repository
public interface ManagerLoginRepository extends JpaRepository<Manager, String>{
	Manager findByMail(String mail);

}
