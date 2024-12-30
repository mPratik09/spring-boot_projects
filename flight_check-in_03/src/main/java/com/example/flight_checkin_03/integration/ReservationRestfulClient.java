package com.example.flight_checkin_03.integration;

import org.springframework.web.bind.annotation.RequestBody;

import com.example.flight_checkin_03.integration.dto.Reservation;

public interface ReservationRestfulClient {
	
	public Reservation findReservation(Long id);
	public Reservation updateReservation(@RequestBody ReservationUpdateRequest request);
	
}
