package com.example.flight_checkin_01.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.flight_checkin_01.controller.dto.Reservation;
import com.example.flight_checkin_01.controller.dto.ReservationUpdateRequest;

@Controller
public class ReservationController {
	
	private static final Logger logger = LoggerFactory.getLogger(ReservationController.class);
	
	@RequestMapping("/showCheckIn")
	public String showCheckIn() {
		logger.info("SHOW Check In..");
		System.out.println("SHOW Check In..");
		return "showCheckIn";
	}
	
	@RequestMapping("/startCheckIn")
	public String startCheckIn(@RequestParam("id") Long id, ModelMap modelMap) {
		logger.info("START Check In..");
		System.out.println("START Check In..");
		
		ReservationRestfulClientImpl restClient = new ReservationRestfulClientImpl();
		
		Reservation reservation = restClient.findReservation(id);
		
		System.out.println(reservation.getNumOfBags());
		System.out.println(reservation.isCheckedIn());
		System.out.println(reservation.getId());
		
		modelMap.addAttribute("reservation", reservation);
		
		logger.info("END START Check In..");
		return "confirmCheck";
//		return "";
	}
	
	@RequestMapping("/finalConfirmation")
	public String finalConfirmation(@RequestParam("numOfBags") int numOfBags, @RequestParam("id") Long id, ModelMap modelMap) {
		
		logger.info("Final Confirmation..");
		
		ReservationUpdateRequest request = new ReservationUpdateRequest();
		request.setId(id);

		request.setCheckedIn(true);
		request.setNumOfBags(numOfBags);
		
		ReservationRestfulClientImpl restClient = new ReservationRestfulClientImpl();
		Reservation reservation = restClient.updateReservation(request);
		
		modelMap.addAttribute("Added", reservation);
		
		logger.info("End Final Confirmation..");
		
//		return "showCheckIn";
		return "comfirmed";
	}
	
	
	
	
	
	
	
	
	
	
	
	
}














