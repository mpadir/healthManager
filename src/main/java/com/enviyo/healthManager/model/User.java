package com.enviyo.healthManager.model;

import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name ="user" , schema = "public")
public class User {
	
	
	@Id
	@GeneratedValue(generator="system-uuid")
	@GenericGenerator(name="system-uuid",strategy="uuid")
	private String id;
	@Column(name="email")
	private String email;
	@Column(name="user_name")
	private String userName;
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
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	

}
