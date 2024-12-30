package com.example.flight_reservation_app_02.entity;

import javax.persistence.Entity;

@Entity
//@Table(name = "user")
public class User extends AbstractEntity {
	
	private String firstname;
	private String lastname;
	private String email;
	private String password;
	
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	
//	
//	public String getFirstname() {
//		return firstname;
//	}
//	public void setFirstname(String firstName) {
//		this.firstname = firstName;
//	}
//	public String getLastname() {
//		return lastname;
//	}
//	public void setLastname(String lastName) {
//		this.lastname = lastName;
//	}
//	public String getEmail() {
//		return email;
//	}
//	public void setEmail(String email) {
//		this.email = email;
//	}
//	public String getPassword() {
//		return password;
//	}
//	public void setPassword(String password) {
//		this.password = password;
//	}
//	
}
