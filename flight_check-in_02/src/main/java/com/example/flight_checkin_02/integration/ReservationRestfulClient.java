package com.example.flight_checkin_02.integration;

import com.example.flight_checkin_02.integration.dto.Reservation;

public interface ReservationRestfulClient {
	
	public Reservation findReservation(Long id);
	
	
}

