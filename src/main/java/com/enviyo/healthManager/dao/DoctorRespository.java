package com.enviyo.healthManager.dao;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.enviyo.healthManager.model.Doctor;

@Repository
public interface DoctorRespository  extends CrudRepository<Doctor, Integer>{
	
	@Query("select al from Doctor al where email = ?1")
	Doctor findByEmail(String mail);

}
