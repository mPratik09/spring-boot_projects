package com.example.flight_checkin_01.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.client.RestTemplate;

import com.example.flight_checkin_01.controller.dto.Reservation;
import com.example.flight_checkin_01.controller.dto.ReservationUpdateRequest;

@Component
public class ReservationRestfulClientImpl implements ReservationRestfulClient {

	private static final Logger ImplLogger = LoggerFactory.getLogger(ReservationController.class);
	
	@Override
	public Reservation findReservation(Long id) {
		
		ImplLogger.info("Find Reservation..");
		
		RestTemplate restTemplate = new RestTemplate();
		Reservation reservation = restTemplate.getForObject("http://localhost:8080/flight_reservation_app_01/reservations/"+id, Reservation.class);
		
		return reservation;
	}

	@Override
	public Reservation updateReservation(@RequestBody ReservationUpdateRequest request) {
		
		ImplLogger.info("Update Reservation..");
		
		RestTemplate restTemplate = new RestTemplate();
		Reservation reservation = restTemplate.postForObject("http://localhost:8080/flight_reservation_app_01/reservation", request, Reservation.class);
		
		ImplLogger.info("End Update Reservation..");
		return reservation;
	}
	
	
	
}
