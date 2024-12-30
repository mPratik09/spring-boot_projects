package com.example.flight_reservation_app_03.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.example.flight_reservation_app_03.entity.User;
import com.example.flight_reservation_app_03.repositories.UserRepository;

@Controller
public class UserController {

	@Autowired
	UserRepository userRepo;
	
	@RequestMapping("/showReg")
	public String showReg() {
		return "login/showReg";
	}
	
	@RequestMapping(value = "/saveReg", method = RequestMethod.GET)
	public String saveReg(@ModelAttribute User user, ModelMap modelMap) {
		userRepo.save(user);
		modelMap.addAttribute("msg", "Record Saved..");
		return "login/showReg";	
	}
}
