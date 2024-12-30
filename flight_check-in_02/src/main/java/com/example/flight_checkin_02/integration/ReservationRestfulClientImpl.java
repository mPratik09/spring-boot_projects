package com.example.flight_checkin_02.integration;

import org.springframework.web.client.RestTemplate;

import com.example.flight_checkin_02.integration.dto.Reservation;

public class ReservationRestfulClientImpl implements ReservationRestfulClient {

	@Override
	public Reservation findReservation(Long id) {
		RestTemplate restTemplate = new RestTemplate();
		Reservation reservation = restTemplate.getForObject("http://localhost:8080/flight_reservation_app_01/reservations/"+id, Reservation.class);
		return reservation;
	}
	
	//		Property [getReservation] not found on type [com.example.flight_checkin_02.integration.dto.Reservation]
	
}
