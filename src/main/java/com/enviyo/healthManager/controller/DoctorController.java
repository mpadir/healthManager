package com.enviyo.healthManager.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.enviyo.healthManager.dao.DoctorRespository;
import com.enviyo.healthManager.model.Doctor;

@CrossOrigin
@RestController
@Controller
public class DoctorController {
	
	@Autowired
	DoctorRespository doctorRespository;
	
	@PostMapping("/login")
	public ResponseEntity<Doctor> Login(@RequestBody Doctor doctor) {
		Doctor newDoctor =new Doctor();
		
		newDoctor = doctorRespository.findByEmail(doctor.getEmail());
		if(newDoctor != null) {
			if(newDoctor.getPassword().equals( doctor.getPassword())) {
				return new ResponseEntity<Doctor>(newDoctor,HttpStatus.OK);
			}
		}
		return null;
	}
	/*
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
*/
}
