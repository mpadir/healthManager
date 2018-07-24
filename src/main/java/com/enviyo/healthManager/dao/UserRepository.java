package com.enviyo.healthManager.dao;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.enviyo.healthManager.model.User;

public interface UserRepository extends CrudRepository<User, Integer> {
	
	@Query("select al from User al where userName = ?1")
	User findByUserName(Integer userName);

}
