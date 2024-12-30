package com.example.flight_checkin_04.integration;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.client.RestTemplate;

import com.example.flight_checkin_04.integration.dto.Reservation;
import com.example.flight_checkin_04.integration.dto.ReservationUpdateRequest;

@Component
public class ReservationRestClient {
	
	public Reservation findReservation(Long id) {
		
		RestTemplate restTemplate = new RestTemplate();
		Reservation reservation = restTemplate.getForObject("http://localhost:8080/flight_reservation_app_01/reservations/"+id, Reservation.class);		
		
		return reservation;
	}
	
	public Reservation updateReservation(@RequestBody ReservationUpdateRequest request) {
		
		RestTemplate restTemplate = new RestTemplate();
//		Reservation reservation = restTemplate.postForObject("http://localhost:8080/flight_reservation_app_01/reservation", request, Reservation.class);		
		Reservation reservation = restTemplate.postForObject("http://localhost:8080/flight_reservation_app_01/reservations", request, Reservation.class);		
		
		return reservation;
	}
	
}	
	
	




