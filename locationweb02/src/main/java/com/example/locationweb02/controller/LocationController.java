package com.example.locationweb02.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.locationweb02.entities.Location;
import com.example.locationweb02.repositories.LocationRepository;
import com.example.locationweb02.util.EmailUtil;

@Controller
public class LocationController {
	
	@Autowired
	private LocationRepository locationRepo;

	@Autowired
	private EmailUtil emailUtil;

	@RequestMapping("/showLocation")
	public String showLocation() {
		return "addLocation";
	}
	
//	@RequestMapping("/saveLoc")
//	public String saveLoc(@ModelAttribute("location") Location location, ModelMap modelmap) {
//		locationRepo.save(location);
//		modelmap.addAttribute("msg", "Location Is Saved..");
//		return "addLocation";
//	}
	
//	send us Email..
	@RequestMapping("/saveLoc")
	public String saveLoc(@ModelAttribute("location") Location location, ModelMap modelmap) {
		locationRepo.save(location);
		emailUtil.sendEmail("patrickmarkad09@gmail.com", "TEST123", "test");
		modelmap.addAttribute("msg", "Location Is Saved..");
		return "addLocation";
	}

	@RequestMapping("/listLoc")  
	public String listLocation(ModelMap modelMap) {
		List<Location> locations = locationRepo.findAll();
		modelMap.addAttribute("locations", locations);
//			System.out.println(locations);
		return "displayLocation";
	}
		
}

//			
//			@RequestMapping("/listLoc") 
//			public String listLocation(){
//				Iterable<Location> findAll = locationRepo.findAll();
//				
//				return null;
//			}