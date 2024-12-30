package com.example.flight_reservation_app_02.entity;

import javax.persistence.Entity;

@Entity
public class Passenger extends AbstractEntity {
	
	private String pFirstName;
	private String pLastName;
	private String pMiddleName;
	private String pEmail;
	private String pPhoneNum;
	
	public String getpFirstName() {
		return pFirstName;
	}
	public void setpFirstName(String pFirstName) {
		this.pFirstName = pFirstName;
	}
	public String getpLastName() {
		return pLastName;
	}
	public void setpLastName(String pLastName) {
		this.pLastName = pLastName;
	}
	public String getpMiddleName() {
		return pMiddleName;
	}
	public void setpMiddleName(String pMiddleName) {
		this.pMiddleName = pMiddleName;
	}
	public String getpEmail() {
		return pEmail;
	}
	public void setpEmail(String pEmail) {
		this.pEmail = pEmail;
	}
	public String getpPhoneNum() {
		return pPhoneNum;
	}
	public void setpPhoneNum(String pPhoneNum) {
		this.pPhoneNum = pPhoneNum;
	}
	
}
