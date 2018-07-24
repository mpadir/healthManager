package com.enviyo.healthManager.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.enviyo.healthManager.dao.UserRepository;
import com.enviyo.healthManager.model.User;

@RestController
@Controller
public class UserController {
	
	@Autowired
	private UserRepository userRepository;
	
	
	@PostMapping("/login")
	public ResponseEntity<User> Login(@RequestBody User user) {
		User newUser = new User();
		
		newUser = userRepository.findByUserName(user.getUserName());
		if(newUser != null) {
			if(newUser.getPassword() == user.getPassword()) {
				return new ResponseEntity<User>(newUser,HttpStatus.OK);
			}
		}
		return null;
	}

}
