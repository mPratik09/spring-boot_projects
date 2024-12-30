package com.example.flight_checkin_01.controller;

//	import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestBody;

import com.example.flight_checkin_01.controller.dto.Reservation;
import com.example.flight_checkin_01.controller.dto.ReservationUpdateRequest;

//@Component
public interface ReservationRestfulClient {
	
	public Reservation findReservation(Long id);
	public Reservation updateReservation(@RequestBody ReservationUpdateRequest request);
	
}
