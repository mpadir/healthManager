package com.enviyo.healthManager.model;

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
