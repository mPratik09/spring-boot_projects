package com.example.flight_checkin_04.integration.dto;

public class ReservationUpdateRequest {
	

	private Long id;
	private int numOfBags;
	private boolean checkedIn;
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public int getNumOfBags() {
		return numOfBags;
	}

	public void setNumOfBags(int numOfBags) {
		this.numOfBags = numOfBags;
	}

	public boolean isCheckedIn() {
		return checkedIn;
	}

	public void setCheckedIn(boolean checkedIn) {
		this.checkedIn = checkedIn;
	}

}








