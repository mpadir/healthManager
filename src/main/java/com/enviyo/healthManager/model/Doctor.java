package com.enviyo.healthManager.model;

import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name ="doctor")
public class Doctor {
	
	@Id
	@Column(name="id")
	private Integer id;
	
	@Column(name = "doctor_name")
	private String doctorName;
	
	@Column(name =  "doctor_surname")
	private String doctorSurname;
	
	@Column(name = "license_number")
	private BigDecimal licenseNumber;
	
	@Column(name = "email")
	private String email;
	
	@Column(name = "work_places")
	private String workPlaces;
	
	@Column(name = "password")
	private String password;
	
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getWorkPlaces() {
		return workPlaces;
	}
	public void setWorkPlaces(String workPlaces) {
		this.workPlaces = workPlaces;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getDoctorName() {
		return doctorName;
	}
	public void setDoctorName(String doctorName) {
		this.doctorName = doctorName;
	}
	public String getDoctorSurname() {
		return doctorSurname;
	}
	public void setDoctorSurname(String doctorSurname) {
		this.doctorSurname = doctorSurname;
	}
	public BigDecimal getLicenseNumber() {
		return licenseNumber;
	}
	public void setLicenseNumber(BigDecimal licenseNumber) {
		this.licenseNumber = licenseNumber;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}

}
