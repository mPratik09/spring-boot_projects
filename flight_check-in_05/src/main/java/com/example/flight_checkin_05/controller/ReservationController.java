package com.example.flight_checkin_05.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.flight_checkin_05.integration.ReservationRestfulClient;
import com.example.flight_checkin_05.integration.ReservationRestfulClientImpl;
import com.example.flight_checkin_05.integration.dto.Reservation;
import com.example.flight_checkin_05.integration.dto.ReservationUpdateRequest;

@Controller
public class ReservationController {
	
	@Autowired
	ReservationRestfulClient restClient;
	
	
	@RequestMapping("/showCheckIn")
	public String showCheckIn() {
		return "showCheckIn";
	}
	
	@RequestMapping("/startCheckIn")
	public String startCheckIn(@RequestParam("resId") Long id, ModelMap modelMap) {
		
//		System.out.println("Id:\t" + id);
		
//		ReservationRestfulClientImpl restClient = new ReservationRestfulClientImpl();
		
		Reservation reservation = restClient.findReservation(id);
		
		modelMap.addAttribute("reservation", reservation);
		modelMap.addAttribute("not_yet", "not yet checked in");
		
		return "confirmReservation";
	}
	
	@RequestMapping("/finalConfirmation")
	public String finalConfirmation(@RequestParam("numOfBags") int numOfBags, @RequestParam("id") Long id, ModelMap modelMap) {
		
		ReservationUpdateRequest request = new ReservationUpdateRequest();
		request.setId(id);
		request.setNumOfBags(numOfBags);
		request.setCheckedIn(true);
		
		ReservationRestfulClient restClient = new ReservationRestfulClientImpl();
		Reservation reservation = restClient.updateReservation(request);
		System.out.println("reservation:\t" + reservation);
		modelMap.addAttribute("msg", "Passenger has Checked In woth reservatio id:\t");
		modelMap.addAttribute("reservation", reservation);
		

		restClient.updateReservation(request);

		
//		return "confirmedStatus";
		return "confirmReservation";
		
	}
	
	
}
