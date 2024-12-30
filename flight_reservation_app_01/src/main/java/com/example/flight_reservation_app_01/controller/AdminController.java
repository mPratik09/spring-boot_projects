package com.example.flight_reservation_app_01.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.flight_reservation_app_01.entity.Admin;
import com.example.flight_reservation_app_01.repositories.AdminRepository;

@Controller
public class AdminController {
	
	@Autowired
	AdminRepository adminRepo;

	@RequestMapping("/createAdmin")
	public String createAdmin() {
		return "createAdmin";
	}
	
	@RequestMapping("/saveAdmin")
	public String saveAdmin(@ModelAttribute Admin admin, ModelMap modelMap,
			@RequestParam("reEnterPassword") String reEnterPassword) {
		
		if(admin.getPassword().equals(reEnterPassword)) {
			adminRepo.save(admin);
			modelMap.addAttribute("msg", "Redcord saved..");
			return "createAdmin";
		}
		modelMap.addAttribute("msg", "Password did not matched..");

	return "createAdmin";
	}
	
}





