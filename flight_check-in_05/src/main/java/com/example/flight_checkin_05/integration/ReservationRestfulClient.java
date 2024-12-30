package com.example.flight_checkin_05.integration;

import org.springframework.web.bind.annotation.RequestBody;

import com.example.flight_checkin_05.integration.dto.Reservation;
import com.example.flight_checkin_05.integration.dto.ReservationUpdateRequest;

public interface ReservationRestfulClient {
	
	public Reservation findReservation (Long id);

	public Reservation updateReservation (@RequestBody ReservationUpdateRequest request);

}
