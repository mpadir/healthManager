package com.enviyo.healthManager.controller;

import java.math.BigDecimal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.enviyo.healthManager.dao.DoctorRespository;
import com.enviyo.healthManager.model.Doctor;

import antlr.collections.List;

@CrossOrigin
@RestController
public class DoctorController {
	
	@Autowired
	DoctorRespository doctorRespository;
	
	@GetMapping("/doctor/{licanseNumber}")
	public java.util.List<Doctor> get(@PathVariable BigDecimal licanceNumebr){
		java.util.List<Doctor> doctors = (java.util.List<Doctor>) doctorRespository.findAll();
		return doctors;
	}
	
	@PostMapping("/doctorP")
	public ResponseEntity<Doctor> update(@RequestBody Doctor doctor){
		Doctor newdoctor = new Doctor();
		if(doctor != null ) {
			newdoctor = doctorRespository.save(doctor);
		}
		
		return new ResponseEntity<Doctor>(HttpStatus.OK);
	}	

}
