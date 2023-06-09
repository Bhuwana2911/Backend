package com.example.admin.login.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.admin.login.model.Manager;

@Repository
public interface ManagerRepository extends JpaRepository<Manager, String>{
	Manager findByMail(String mail);
	Manager findByMid(String mid);
	

}
