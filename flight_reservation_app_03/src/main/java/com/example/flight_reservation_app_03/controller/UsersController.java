package com.example.flight_reservation_app_03.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.example.flight_reservation_app_03.entity.Users;
import com.example.flight_reservation_app_03.repositories.UsersRepository;

@Controller
public class UsersController {
	
	@Autowired
	UsersRepository usersRepo;
	
	@RequestMapping("/showReg")
	public String showReg() {
		return "login/showReg";
	}
	
	@RequestMapping(value = "/saveReg", method = RequestMethod.GET)
	public String saveReg(@ModelAttribute Users users, ModelMap modelMap) {
		usersRepo.save(users);
		modelMap.addAttribute("msg", "Recorded SSSS wali file..");
		return "login/showReg";
	}
}	
