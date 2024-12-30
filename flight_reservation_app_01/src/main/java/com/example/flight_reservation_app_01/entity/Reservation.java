package com.example.flight_reservation_app_01.entity;

import javax.persistence.Entity;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="reservation_01")
public class Reservation extends AbstractEntity {
	
	private int numOfBags;
	private boolean checkedIn;
	
	@OneToOne
	private Passenger passenger;
	
	@OneToOne
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
	
}
