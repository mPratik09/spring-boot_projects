package com.example.locationweb02.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.locationweb02.entities.Location;
import com.example.locationweb02.repositories.LocationRepository;

@RestController

//@RequestMapping(path = "/findAllLocation")
public class LocationRestController {
//	
	@Autowired
	LocationRepository locationRepo;
	
	@GetMapping(path = "/findAllLocation")
//	@GetMapping
	public List<Location> findAllLocation() {
		List<Location> locations = locationRepo.findAll();
		return locations;
	}

	@PostMapping(path = "/saveLoc")
	public void saveLoc(@RequestBody Location location) {
		locationRepo.save(location);
	}
	
	@DeleteMapping(path = "/deleteLocation/{id}")
	public void deleteLocation(@PathVariable("id") Long id) {
		locationRepo.deleteById(id);
	}
	
	@PutMapping(path = "/updateLocation")
	public void updateLocation(@RequestBody Location location) {
		locationRepo.save(location);
	}
	
}
