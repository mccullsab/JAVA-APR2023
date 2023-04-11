package com.heidichen.mvcdemo.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.heidichen.mvcdemo.models.Donation;
import com.heidichen.mvcdemo.services.DonationService;

@Controller
public class HomeController {

	@Autowired
	private DonationService donationService;
	
	@GetMapping("/donations")
	public String donationBoard(Model model) {
		List<Donation> donationList = donationService.allDonations();
		model.addAttribute("donationList", donationList);
		return "dashboard.jsp";
	}
	
	@GetMapping("/donations/{id}")
	public String donationDetails(@PathVariable("id")Long id, Model model) {
		Donation oneDonation = donationService.findDonation(id);
		model.addAttribute("oneDonation", oneDonation);
		return "details.jsp";
	}
	
}
