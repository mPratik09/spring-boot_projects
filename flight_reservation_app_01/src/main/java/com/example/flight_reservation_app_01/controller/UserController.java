package com.example.flight_reservation_app_01.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.flight_reservation_app_01.entity.User;
import com.example.flight_reservation_app_01.repositories.UserRepository;

@Controller
public class UserController {

	@Autowired
	UserRepository userRepo;
	
	@RequestMapping("/showReg")
	public String showReg() {
		return "login/showReg";
	}
	
	@RequestMapping(value = "/saveReg", method = RequestMethod.POST)
	public String saveReg(@ModelAttribute User user, ModelMap modelMap,
			@RequestParam("reEnterPassword") String reEnterPassword) {
		
		if(user.getPassword().equals(reEnterPassword)) {
			userRepo.save(user);
			modelMap.addAttribute("msg", "Redcord saved..");
			return "login/showReg";
		}
		modelMap.addAttribute("msg", "Password did not matched..");
		return "login/showReg";
	}
	
	@RequestMapping("/showLogin")
	public String showLogin() {
		return "login/login";
	}

	@RequestMapping("/verifyLogin")
	public String verifyLogin(@RequestParam("email") String email, @RequestParam("password") String password,
			ModelMap modelMap) {
		
		try {
			User user = userRepo.findByEmail(email);
	
			if (user.getEmail().equals(email) && user.getPassword().equals(password)) {
				return "searchFlights";
			} else {
				modelMap.addAttribute("$msg", "Invalid arguements...");
				return "index";
			}
		} catch (Exception e) {
			modelMap.addAttribute("msg", "Invalid parameters!!");
			return "index";
		}
		
			
	}


}
	
	



	
	
	
	
	
	
	
	
	
	
	
	
	
	