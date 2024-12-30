package com.example.flight_reservation_app_01.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.flight_reservation_app_01.entity.Flight;
import com.example.flight_reservation_app_01.entity.Passenger;
import com.example.flight_reservation_app_01.entity.Reservation;
import com.example.flight_reservation_app_01.repositories.FlightRepository;
import com.example.flight_reservation_app_01.repositories.PassengerRepository;
import com.example.flight_reservation_app_01.repositories.ReservationRepository;
import com.example.flight_reservation_app_01.util.EmailUtil;
import com.example.flight_reservation_app_01.util.PDFgenerator;

@Controller
public class ReservationController {

//	private static String folderPath = "E:\\Java\\SpringBoot_02\\workspace-spring-tool-suite-4-4.9.0.RELEASE\\flight_reservation_app_01\\tickets\\";
	private static String folderPath = "D:\\Java\\SpringBoot_02\\workspace-spring-tool-suite-4-4.9.0.RELEASE\\flight_reservation_app_01\\tickets\\";
	
	@Autowired
	FlightRepository flightRepo;

	@Autowired
	PassengerRepository passengerRepo;

	@Autowired
	ReservationRepository reservationRepo;

	@Autowired
	PDFgenerator pdfGen;
	
	@Autowired
	EmailUtil emailUtil;
	
	@RequestMapping("/showCompleteReservation")
	public String showCompleteReservation(@RequestParam("flightId") Long flightId, ModelMap modelMap) {
		Optional<Flight> findById = flightRepo.findById(flightId);
		Flight flight = findById.get();
		modelMap.addAttribute("flight", flight);
		return "showCompleteReservation";
	}

	@RequestMapping("/confirmReservation")
	public String confirmReservation(@RequestParam("p_first_name") String pFirstName, 
			@RequestParam("pLastName") String pLastName, @RequestParam("pMiddleName") String pMiddleName,
			@RequestParam("pEmail") String pEmail, @RequestParam("pPhoneNum") String pPhoneNum,
			@RequestParam("flightId") Long flightId, ModelMap modelMap) {
		
		Passenger passenger = new Passenger();
		passenger.setpFirstName(pFirstName);
		passenger.setpLastName(pLastName);
		passenger.setpMiddleName(pMiddleName);
		passenger.setpEmail(pEmail);
		passenger.setpPhoneNum(pPhoneNum);
		
		passengerRepo.save(passenger);
		
		Optional<Flight> findById = flightRepo.findById(flightId);
		Flight flight = findById.get();
		
		Reservation reservation = new Reservation();
		
		reservation.setCheckedIn(false);
		reservation.setNumOfBags(0);
		reservation.setPassenger(passenger);
		reservation.setFlight(flight);
		
		reservationRepo.save(reservation);

//		long resId = reservation.getId();
//		System.out.println("Reservation Id:\t\t" + resId);
		
		modelMap.addAttribute("rId", reservation.getId());
//		modelMap.addAttribute("abc", passenger.getpLastName());
		modelMap.addAttribute("firstName", pFirstName);
		modelMap.addAttribute("lastName", pLastName);
		modelMap.addAttribute("middleName", pMiddleName);
		modelMap.addAttribute("email", pEmail);
		modelMap.addAttribute("phone", pPhoneNum);
		modelMap.addAttribute("operatingAirlines", flight.getOperatingAirlines());
		modelMap.addAttribute("departureCity", flight.getDepartureCity());
		modelMap.addAttribute("arrivalCity", flight.getArrivalCity());
		modelMap.addAttribute("estimatedDepartureTime", flight.getEstimatedDepartureTime());
		
		String estimatedDepartureTime = flight.getEstimatedDepartureTime().toString();
		
		
		pdfGen.generatePDF(folderPath + "ticket" + passenger.getId() + ".pdf", passenger.getpFirstName(), passenger.getpEmail(),
				passenger.getpPhoneNum(), flight.getOperatingAirlines(), estimatedDepartureTime,
				flight.getDepartureCity(), flight.getArrivalCity(), reservation.getId());
		
		emailUtil.sendItinerary(passenger.getpEmail(), folderPath + "ticket" + passenger.getId() + ".pdf");
		
		return "confirmationPage";
		
	}
	
	@RequestMapping("/logout")
	public String logout() {
		return "index";
	}
	
	
}	
	
	
//				@RequestMapping("/confirmReservation")
//				public String confirmReservation(@RequestParam("firstName") String firstName,
//						@RequestParam("lastName") String lastName, @RequestParam("middleName") String middleName,
//						@RequestParam("email") String email, @RequestParam("phone") String phone,
//						@RequestParam("flightId") Long flightId, ModelMap modelMap) {
//			//			@RequestParam("flightId") Long flightId, Model model) {
//					
//			//	public String confirmReservation(@RequestParam("firstName") String firstName,
//			//			@RequestParam("lastName") String lastName, @RequestParam("middleName") String middleName,
//			//			@RequestParam("email") String email, @RequestParam("phone") String phone,
//			//			@RequestParam("flightId") Long flightId, ModelMap modelMap, String estimatedDepartureTime)
//					
//					
//					Passenger passenger = new Passenger();
//					passenger.setpFirstName(firstName);
//					passenger.setpLastName(lastName);
//					passenger.setpMiddleName(middleName);
//					passenger.setpEmail(email);
//					passenger.setpPhoneNum(phone);
//					
//					passengerRepo.save(passenger);
//					
			//		model.addAttribute("passenger", passenger);
//					
//					Optional<Flight> findById = flightRepo.findById(flightId);
//					Flight flight = findById.get();
//					
//					Reservation reservation = new Reservation();
//					reservation.setCheckedIn(false);
//					reservation.setNumOfBags(0);
//					reservation.setPassenger(passenger);
//					reservation.setFlight(flight);
//					
//					reservationRepo.save(reservation);
//					
//			//		model.addAttribute("reservation", reservation);
//					
//			//		model.addAttribute("firstName", firstName);
//			//		model.addAttribute("lastName", lastName);
//			//		model.addAttribute("middleName", middleName);
//			//		model.addAttribute("email", email);
//			//		model.addAttribute("phone", phone);
//					
//					modelMap.addAttribute("firstName", firstName);
//					modelMap.addAttribute("lastName", lastName);
//					modelMap.addAttribute("middleName", middleName);
//					modelMap.addAttribute("email", email);
//					modelMap.addAttribute("phone", phone);
//					modelMap.addAttribute("operatingAirlines", flight.getOperatingAirlines());
//					modelMap.addAttribute("departureCity", flight.getDepartureCity());
//					modelMap.addAttribute("arrivalCity", flight.getArrivalCity());
//					modelMap.addAttribute("estimatedDepartureTime", flight.getEstimatedDepartureTime());
//					
//					
//					System.out.println(firstName + lastName + middleName + email + phone);
//					
//					String estimatedDepartureTime = flight.getEstimatedDepartureTime().toString();
//					
//			//		pdfGen.generatePDF("C:/Users/hp/Desktop/Java/mfirstfile.pdf",  passenger.getpFirstName(), passenger.getpEmail(),
//			//				passenger.getpPhoneNum(), flight.getOperatingAirlines(), estimatedDepartureTime,
//			//				flight.getDepartureCity(), flight.getArrivalCity());
//					pdfGen.generatePDF(folderPath + "ticket" + passenger.getId() + ".pdf", passenger.getpFirstName(), passenger.getpEmail(),
//							passenger.getpPhoneNum(), flight.getOperatingAirlines(), estimatedDepartureTime,
//							flight.getDepartureCity(), flight.getArrivalCity());
//					
//					emailUtil.sendItinerary(passenger.getpEmail(), folderPath + "ticket" + passenger.getId() + ".pdf");
//					
//					return "demo";
//					
//				}


//G:\Java\SpringBoot_02\workspace-spring-tool-suite-4-4.9.0.RELEASE\flight_reservation_app_01\tickets\