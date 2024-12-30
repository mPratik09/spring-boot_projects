package com.example.flight_checkin_02.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.flight_checkin_02.integration.ReservationRestfulClientImpl;
import com.example.flight_checkin_02.integration.dto.Reservation;

@Controller
public class ReservationController {
	
	@RequestMapping("/showCheckIn")
	public String showCheckIn() {
		System.out.println("SHOW Check In..");
		return "showCheckIn";
	}
	
	@RequestMapping("/startCheckIn")
	public String startCheckIn(@RequestParam("id") Long id, ModelMap modelMap) {
		System.out.println("START Check In..");
		System.out.println(id);
		ReservationRestfulClientImpl restClient = new ReservationRestfulClientImpl();
		Reservation reservation = restClient.findReservation(id);
		
		modelMap.addAttribute("reservation", reservation);
		return "confirmReservation";
	}
	
}
