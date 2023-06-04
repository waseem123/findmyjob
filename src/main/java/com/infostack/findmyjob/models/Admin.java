package com.infostack.findmyjob.models;

import javax.persistence.Entity;

@Entity
public class Admin {
	private Long adminId;
	private String adminName;
	private String adminEmail;
	private String adminMobileNo;
	private String adminPassword;
	
	public Admin() {
		super();
	}

	public Admin(Long adminId, String adminName, String adminEmail, String adminMobileNo, String adminPassword) {
		super();
		this.adminId = adminId;
		this.adminName = adminName;
		this.adminEmail = adminEmail;
		this.adminMobileNo = adminMobileNo;
		this.adminPassword = adminPassword;
	}

	public Long getAdminId() {
		return adminId;
	}

	public void setAdminId(Long adminId) {
		this.adminId = adminId;
	}

	public String getAdminName() {
		return adminName;
	}

	public void setAdminName(String adminName) {
		this.adminName = adminName;
	}

	public String getAdminEmail() {
		return adminEmail;
	}

	public void setAdminEmail(String adminEmail) {
		this.adminEmail = adminEmail;
	}

	public String getAdminMobileNo() {
		return adminMobileNo;
	}

	public void setAdminMobileNo(String adminMobileNo) {
		this.adminMobileNo = adminMobileNo;
	}

	public String getAdminPassword() {
		return adminPassword;
	}

	public void setAdminPassword(String adminPassword) {
		this.adminPassword = adminPassword;
	}
	
}
