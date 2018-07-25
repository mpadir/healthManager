package com.enviyo.healthManager.model;

import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name ="user" , schema = "public")
public class User {
	@Id
	private Integer userName;
	@Column(name = "password")
	private String password;
	@Column(name = "license_number")
	private BigDecimal licenseNumber;
	
	public BigDecimal getLicenseNumber() {
		return licenseNumber;
	}
	public void setLicenseNumber(BigDecimal licenseNumber) {
		this.licenseNumber = licenseNumber;
	}
	public Integer getUserName() {
		return userName;
	}
	public void setUserName(Integer userName) {
		this.userName = userName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	

}
