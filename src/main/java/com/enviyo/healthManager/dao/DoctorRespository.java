package com.enviyo.healthManager.dao;

import java.math.BigDecimal;

import org.springframework.data.repository.CrudRepository;

import com.enviyo.healthManager.model.Doctor;

public interface DoctorRespository  extends CrudRepository<Doctor, BigDecimal>{

}
