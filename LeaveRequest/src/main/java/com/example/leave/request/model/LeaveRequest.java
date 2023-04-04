package com.example.leave.request.model;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
@Table(name = "leaveRequest")

public class LeaveRequest {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	@NotNull
	@Column
	private Date sdate;
	
	
	@NotNull
	@Column
	private Date edate;
	
	
	@NotNull
	@Column
	private String reason;
	
	
	
	@Column
	private String status;
	
	@Column
	@Size(message = "No leave request with this employee mail")
	@NotNull
	@Email
	private String employeeMail;
	
	@Column
	@NotNull
	@Email
	private String mail;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public Date getSdate() {
		return sdate;
	}

	public void setSdate(Date sdate) {
		this.sdate = sdate;
	}

	public Date getEdate() {
		return edate;
	}

	public void setEdate(Date edate) {
		this.edate = edate;
	}

	public String getReason() {
		return reason;
	}

	public void setReason(String reason) {
		this.reason = reason;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
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
	

	public LeaveRequest() {
		super();
	}

	public LeaveRequest(long id, @NotNull Date sdate, @NotNull Date edate, @NotNull String reason, String status,
			@Size(message = "No leave request with this employee mail") @NotNull @Email String employeeMail,
			@Email @NotNull String mail) {
		super();
		this.id = id;
		this.sdate = sdate;
		this.edate = edate;
		this.reason = reason;
		this.status = status;
		this.employeeMail = employeeMail;
		this.mail = mail;
	}

	
	
	

//	public LeaveRequest(String mail) {
//		super();
//		this.mail = mail;
//	}

//	public static Object builder() {
//		// TODO Auto-generated method stub
//		return null;
//	}
	
}
