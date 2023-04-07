package com.heidichen.springdemo.controllers;

import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

	@GetMapping("/home")
	public String renderHome() {
		return "home.jsp";
	}
	
	@GetMapping("/jstl")
	public String renderJSTLDemo(Model model) {
		String name = "Pep";
		Integer happiness = 1;
		String hackerCode = "<script>alert('Hi')</script>";
		
		model.addAttribute("jspName", name);
		model.addAttribute("jspHappiness", happiness);
		model.addAttribute("hackerCode", hackerCode);
		
		ArrayList<String> skills = new ArrayList<>();
		skills.add("Breaking the code");
		skills.add("Bootstrap");
		skills.add("Sleeping while standing");
		model.addAttribute("skillList", skills);
		
		for(String eachSkill: skills) {
			System.out.println(eachSkill);
		}
		
		return "jstl.jsp";
	}
	
	
}
