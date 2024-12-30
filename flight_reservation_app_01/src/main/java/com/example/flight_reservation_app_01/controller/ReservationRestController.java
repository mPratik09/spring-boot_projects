package com.example.flight_reservation_app_01.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.flight_reservation_app_01.entity.Reservation;
import com.example.flight_reservation_app_01.entity.ReservationUpdateRequest;
import com.example.flight_reservation_app_01.repositories.ReservationRepository;

@RestController
public class ReservationRestController {
	
	@Autowired
	ReservationRepository reservationRepo;
	
	@RequestMapping("/reservations/{id}")
	public Reservation findReservation(@PathVariable("id") Long id) {
		Optional<Reservation> findById = reservationRepo.findById(id);
		return findById.get();
	}
	
//	@RequestMapping("/reservation")
//	public void updateReservation(@RequestBody ReservationUpdateRequest request) {
//		
//		long id = request.getId();
//		
//		Optional<Reservation> findById = reservationRepo.findById(id);
//		Reservation reservation = findById.get();
//
//		reservation.setNumOfBags(request.getNumOfBags());
//		reservation.setCheckedIn(true);
//		
//		reservationRepo.save(reservation);
//	}


	@RequestMapping("/reservation")
	public Reservation updateReservation(@RequestBody ReservationUpdateRequest request) {
		
		long id = request.getId();
		
		Optional<Reservation> findById = reservationRepo.findById(id);
		Reservation reservation = findById.get();
		
		reservation.setCheckedIn(request.isCheckedIn());
		reservation.setNumOfBags(request.getNumOfBags());
		
		return reservationRepo.save(reservation);
	}
	
}
