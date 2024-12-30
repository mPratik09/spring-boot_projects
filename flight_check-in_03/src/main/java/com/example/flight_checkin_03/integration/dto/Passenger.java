package com.example.flight_checkin_03.integration.dto;

public class Passenger {
	
	private Long id;
	private String pFirstName;
	private String pLastName;
	private String pMiddleName;
	private String pEmail;
	private String pPhoneNum;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
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
