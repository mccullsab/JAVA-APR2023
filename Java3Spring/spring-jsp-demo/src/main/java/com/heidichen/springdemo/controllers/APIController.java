package com.heidichen.springdemo.controllers;

import java.util.ArrayList;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class APIController {

	@RequestMapping("/option1") // get/ post/ put / delete / patch
	public ArrayList<String> option1Routing(){
		ArrayList<String> skills = new ArrayList<>();
		skills.add("breaking the code");
		skills.add("debugging");
		return skills;
	}
	
	@RequestMapping(value="/option2", method=RequestMethod.GET)
	public String option2Routing() {
		return "option 2 using long-handed requestmapping";
	}

	
	@GetMapping("/option3")  // @PostMapping, @PutMapping @DeleteMapping
	public String option3Routing() {
		return "option 3: GetMapping";
	}
	
	
	

	
}
