package com.example.flight_checkin_01.controller.dto;

public class Reservation {
	
	private Long id;
	private int numOfBags;
	private boolean checkedIn;
	
	private Passenger passenger;
	private Flight flight;

	public boolean isCheckedIn() {
		return checkedIn;
	}

	public void setCheckedIn(boolean checkedIn) {
		this.checkedIn = checkedIn;
	}

	public int getNumOfBags() {
		return numOfBags;
	}

	public void setNumOfBags(int numOfBags) {
		this.numOfBags = numOfBags;
	}
	
	
	public Passenger getPassenger() {
		return passenger;
	}

	public void setPassenger(Passenger passenger) {
		this.passenger = passenger;
	}

	public Flight getFlight() {
		return flight;
	}

	public void setFlight(Flight flight) {
		this.flight = flight;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	
}