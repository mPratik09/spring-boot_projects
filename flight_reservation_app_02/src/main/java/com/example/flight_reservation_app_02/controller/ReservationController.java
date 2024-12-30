package com.example.flight_reservation_app_02.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.flight_reservation_app_02.entity.Flight;
import com.example.flight_reservation_app_02.entity.Passenger;
import com.example.flight_reservation_app_02.repositories.FlightRepository;
import com.example.flight_reservation_app_02.repositories.PassengerRepository;
import com.example.flight_reservation_app_02.util.EmailUtil;
import com.example.flight_reservation_app_02.util.PDFGenerator;

@Controller
public class ReservationController {
	
//	private static String folderPath = "G:\\Java\\SpringBoot_02\\workspace-spring-tool-suite-4-4.9.0.RELEASE\\flight_reservation_app_02\\tickets\\";

	@Autowired
	FlightRepository flightRepo;

	@Autowired
	PassengerRepository passengerRepo;

	@Autowired
	PDFGenerator pdfGen;
	
	@Autowired
	EmailUtil emailUtil;

	@RequestMapping("/showCompleteReservation")
	public String showCompleteReservation(@RequestParam("flightId") Long flightId, ModelMap modelMap) {
//		System.out.println(id);
		Optional<Flight> findById = flightRepo.findById(flightId);
		Flight flight = findById.get();
		modelMap.addAttribute("flight", flight);
		return "showCompleteReservation";
	}

	@RequestMapping("/confirmReservation")
	public String confirmReservation(@RequestParam("firstName") String firstName,
			@RequestParam("lastName") String lastName, @RequestParam("middleName") String middleName,
			@RequestParam("email") String email, @RequestParam("phone") String phone,
			@RequestParam("flightId") Long flightId, ModelMap modelMap, String estimatedDepartureTime) {

		Passenger passenger = new Passenger();
		passenger.setpFirstName(firstName);
		passenger.setpLastName(lastName);
		passenger.setpMiddleName(middleName);
		passenger.setpEmail(email);
		passenger.setpPhoneNum(phone);

		passengerRepo.save(passenger);

		Optional<Flight> findById = flightRepo.findById(flightId);
		Flight flight = findById.get();

		modelMap.addAttribute("firstName", firstName);
		modelMap.addAttribute("middleName", middleName);
		modelMap.addAttribute("lastName", lastName);
		modelMap.addAttribute("email", email);
		modelMap.addAttribute("phone", phone);
		modelMap.addAttribute("operatingAirlines", flight.getOperatingAirlines());
		modelMap.addAttribute("departureCity", flight.getDepartureCity());
		modelMap.addAttribute("arrivalCity", flight.getArrivalCity());
		modelMap.addAttribute("estimatedDepartureTime", flight.getEstimatedDepartureTime());

		estimatedDepartureTime = flight.getEstimatedDepartureTime().toString();
		
		String folderPath = pdfGen.filePath;
		
		pdfGen.generatePDF(folderPath + "ticket" + passenger.getId() + ".pdf", firstName, email, phone, flight.getOperatingAirlines(), flight.getDepartureCity(), 
				flight.getArrivalCity(), estimatedDepartureTime);
		
		emailUtil.sendItinerary(passenger.getpEmail(), folderPath + "ticket" + passenger.getId() + ".pdf");

//		pdfGen.generatePDF(folderPath + "ticket" + passenger.getId() + ".pdf", passenger.getpFirstName(), passenger.getpEmail(),
//				passenger.getpPhoneNum(), flight.getOperatingAirlines(), estimatedDepartureTime,
//				flight.getDepartureCity(), flight.getArrivalCity());
//		
//		emailUtil.sendItinerary(passenger.getpEmail(), folderPath + "ticket" + passenger.getId() + ".pdf");
		
		return "confirmationPage";
	}

}
