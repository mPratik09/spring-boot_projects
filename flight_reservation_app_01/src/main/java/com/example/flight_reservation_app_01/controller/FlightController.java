package com.example.flight_reservation_app_01.controller;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.flight_reservation_app_01.entity.Flight;
import com.example.flight_reservation_app_01.repositories.FlightRepository;

@Controller
public class FlightController {
	
//	@RequestMapping("/findFlights")
//	public String findFlights(@RequestParam("from") String from, @RequestParam("to") String to, @RequestParam("departureDate") @DateTimeFormat(pattern = "dd/MM/yyyy")  Date departureDate) {
//		System.out.println(from);
//		System.out.println(to);
//		System.out.println(departureDate);
//		return "";
//	}
	
	@Autowired
	private FlightRepository flightRepo;
	
	@RequestMapping("/findFlights")
	public String findFlights(@RequestParam("from") String from, @RequestParam("to") String to, 
			@RequestParam("departureDate") @DateTimeFormat(pattern = "MM-dd-yyyy") Date departureDate, ModelMap modelMap) {
		List<Flight> findFlight = flightRepo.findFlight(from, to, departureDate);
		modelMap.addAttribute("findFlight", findFlight);
		return "displayFlights";
	}
		
}
