package com.example.flight_checkin_03.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.client.RestTemplate;

import com.example.flight_checkin_03.integration.ReservationRestfulClientImpl;
import com.example.flight_checkin_03.integration.ReservationUpdateRequest;
import com.example.flight_checkin_03.integration.dto.Reservation;

@Controller
public class ReservationController {
	
	@RequestMapping("/showCheckIn")
	public String showCheckIn() {
		System.out.println("SHOW check in..");
		return "showCheckIn";
	}

	@RequestMapping("/startCheckIn")
	public String startCheckIn(@RequestParam("id") Long id, ModelMap modelMap) {
		System.out.println("START check in..\t\n\t\t" + id);
		
		ReservationRestfulClientImpl restClient = new ReservationRestfulClientImpl();
		Reservation reservation = restClient.findReservation(id);
		System.out.println(reservation.getId());
		System.out.println(reservation.getNumOfBags());
		System.out.println(reservation.isCheckedIn());
		
//		modelMap.addAttribute("Updated..", reservation);
		modelMap.addAttribute("reservation", reservation);
		
		return "confirmCheck";
	}
	
	@RequestMapping("/finalConfirmation")
	public String finalConfirmation(@RequestParam("numOfBags") int numOfBags, @RequestParam("id") Long id, ModelMap modelMap) {
		ReservationUpdateRequest request = new ReservationUpdateRequest();
		
		request.setId(id);
		request.getNumOfBags();
		request.setCheckedIn(true);
		
		ReservationRestfulClientImpl restClient = new ReservationRestfulClientImpl();
		Reservation reservation = restClient.updateReservation(request);
		
		modelMap.addAttribute("msg", "Passenger has Checked In..");
		modelMap.addAttribute("reservationId", reservation);
		
		return "confirmCheck";
	}

}
