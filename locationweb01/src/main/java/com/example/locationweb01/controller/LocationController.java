package com.example.locationweb01.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.locationweb01.entities.Location;
import com.example.locationweb01.repositories.LocationRepository;
import com.example.locationweb01.util.EmailUtil;

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
	
	
//	send us Email..
	@RequestMapping("/saveLoc")
	public String saveLoc(@ModelAttribute("location") Location location, ModelMap modelmap) {
		locationRepo.save(location);
		emailUtil.sendEmail("pratik.markad1@gmail.com", "TEST123456", "test");
		modelmap.addAttribute("msg", "Location Is Savedddd..");
		return "addLocation";
	}
	
//	@RequestMapping("/saveLoc")
//	public String saveLoc(@ModelAttribute("location") Location location, ModelMap modelmap) {
//		locationRepo.save(location);
//		emailUtil.sendEmail("patrickmarkad09@gmail.com", "TEST_01", "test");
//		modelmap.addAttribute("msg", "Location is saved..");
//		return "addLocation";
//	}
	
	@RequestMapping("/listLoc")  
	public String listLocation(ModelMap modelMap) {
		List<Location> locations = locationRepo.findAll();
		modelMap.addAttribute("locations", locations);
//			System.out.println(locations);
		return "displayLocation";
	}
	
	@RequestMapping("/deleteLocation")  
	public String deleteLocation(@RequestParam("id") Long id, ModelMap modelMap) {
		locationRepo.deleteById(id);
		List<Location> locations = locationRepo.findAll();
		modelMap.addAttribute("locations", locations);
		return "displayLocation";
	}
	
	@RequestMapping("/updateLocation")
	public String updateLocation(@RequestParam("id") Long id, ModelMap modelMap) {
		Optional<Location> findById = locationRepo.findById(id);
		Location location = findById.get();
		modelMap.addAttribute("id", location.getId());
		modelMap.addAttribute("code", location.getCode());
		modelMap.addAttribute("name", location.getName());
		modelMap.addAttribute("type", location.getType());
		
		return "editLocation";
	}
	
	@RequestMapping("/updateLoc")  
	public String updateLoc(@ModelAttribute ("location") Location location, ModelMap modelMap) {
		List<Location> locations = locationRepo.findAll();
		locationRepo.save(location);
		modelMap.addAttribute("msg", "Location uis updated,,");
		modelMap.addAttribute("locations", locations);
		return "displayLocation";
	}
	
	@GetMapping(path = "/findAllLocationss")
//	@GetMapping
	public List<Location> findAllLocation() {
		List<Location> locations = locationRepo.findAll();
		return locations;
	}
	
//	@RequestMapping("/listLoc")
//	public String listLocation(ModelMap modelMap) {
//		List<Location> locations = locationRepo.findAll();
//		modelMap.addAttribute("locations", locations);
//		return "displayLocation";
//	}

//	@RequestMapping("/createTable")
//	public String listLocation(ModelMap modelmap) {
//		List<Location> locations = locationRepo.findAll();
//		modelmap.addAttribute("locations", locations);
//		return "index.html";
//	}
	
}




