package com.heidichen.springdemo.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RoutesController {

	// localhost:8080/search?festival=easter
	
	@GetMapping("/search")
	public String searchFestival(@RequestParam("festival")String fest) {
		return "You searched for " + fest;
		
	}
	
	// GET: localhost:8080/pet?name=pepper&age=14
	@GetMapping("/pet")
	public String searchPet(
			@RequestParam(value="age", required=false) Integer ageInMethod,
			@RequestParam(value="name", required=false ) String nameInMethod
			) {
		if(nameInMethod == null) {
			return "This is a random pet";
		}
		if(ageInMethod == null) {
			return nameInMethod + " is a mysterious pet!";
		}
		return nameInMethod + " is " + ageInMethod + " years old.";
	}
	
	// localhost:8080/activity/string/integer
	
	@GetMapping("/activity/{whatever}/{id}")
	public String activityPath(
			@PathVariable("whatever") String act,
			@PathVariable("id")Integer id) {
		return "Activity ID: "+ id + "Activity: " + act;
	}
	
} 








