package com.example.flight_checkin_04.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.flight_checkin_04.integration.ReservationRestClient;
import com.example.flight_checkin_04.integration.dto.Reservation;
import com.example.flight_checkin_04.integration.dto.ReservationUpdateRequest;

@Controller
public class ReservationController {
	
	@Autowired
	ReservationRestClient restClient;
	
	@RequestMapping("/showCheckIn")
	public String showCheckIn() {
		
		return "showCheckIn";
	}
	
//	@RequestMapping(value="/startCheckIn", method=RequestMethod.GET)
	@RequestMapping("/startCheckIn")
	public String startCheckIn(@RequestParam("id") Long id, ModelMap modelMap) {
		
		ReservationRestClient restClient = new ReservationRestClient();
		
		Reservation reservation = restClient.findReservation(id);
		
//		System.out.println("\nId:\t\t" + reservation.getId());
//		System.out.println("is checked in:\t" + reservation.isCheckedIn());
//		System.out.println("Number of bags:\t" + reservation.getNumOfBags());
		
		modelMap.addAttribute("reservation", reservation);
		
//		return "confirmCheck";
		return "confirmReservation";
	}
	
	@RequestMapping("/finalConfirmation")
	public String finalConfirmation(@RequestParam("numOfBags") int numOfBags, @RequestParam("id") Long id, ModelMap modelMap) {
		
		ReservationUpdateRequest request = new ReservationUpdateRequest();
		
		request.setId(id);
		request.setNumOfBags(numOfBags);
		request.setCheckedIn(true);
		
		ReservationRestClient restClient = new ReservationRestClient();
		
		Reservation reservation = restClient.updateReservation(request);
		
		modelMap.addAttribute("msg", "Passenger has Checked In woth reservatio id:\t");
		modelMap.addAttribute("reservation", reservation);
		
		return "confirmReservation";
//		return "hello";
	}
	
	
	
	

}













