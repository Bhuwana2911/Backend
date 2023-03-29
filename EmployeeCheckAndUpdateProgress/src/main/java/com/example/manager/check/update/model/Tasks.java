package com.example.manager.check.update.model;

import java.time.LocalDate;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "tasks")
public class Tasks {
	
	
	public enum TaskStatus {
		Assigned,
		Completed,
		InProgress,
		Pending,
		Blocked
	}
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private String id;
	
	@Column
	private String employeeMail;
	
	@Column
	private String mail;
	
	@Column
	private String description;
	
	@Column
	private LocalDate deadline;
	
	@Column
	private String tstatus;
	
	@Column
	private String eprogress;
	
	@Column
	private LocalDate submissiondate;
	
	
	
	public String getId() {
		return id;
	}


	public void setId(String id) {
		this.id = id;
	}


	public String getEmployeeMail() {
		return employeeMail;
	}


	public void setEmployeeMail(String employeeMail) {
		this.employeeMail = employeeMail;
	}


	public String getMail() {
		return mail;
	}


	public void setMail(String mail) {
		this.mail = mail;
	}


	public String getDescription() {
		return description;
	}


	public void setDescription(String description) {
		this.description = description;
	}


	public LocalDate getDeadline() {
		return deadline;
	}


	public void setDeadline(LocalDate deadline) {
		this.deadline = deadline;
	}


	public String getTstatus() {
		return tstatus;
	}


	public void setTstatus(String tstatus) {
		this.tstatus = tstatus;
	}


	public String getEprogress() {
		return eprogress;
	}


	public void setEprogress(String eprogress) {
		this.eprogress = eprogress;
	}


	public LocalDate getSubmissiondate() {
		return submissiondate;
	}


	public void setSubmissiondate(LocalDate submissiondate) {
		this.submissiondate = submissiondate;
	}


	public Tasks() {
		super();
	}


	public Tasks(String id, String employeeMail, String mail, String description, LocalDate deadline, String tstatus,
			String eprogress, LocalDate submissiondate) {
		super();
		this.id = id;
		this.employeeMail = employeeMail;
		this.mail = mail;
		this.description = description;
		this.deadline = deadline;
		this.tstatus = tstatus;
		this.eprogress = eprogress;
		this.submissiondate = submissiondate;
	}


	



}
