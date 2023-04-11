package com.heidichen.mvcdemo.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.heidichen.mvcdemo.models.Donation;
import com.heidichen.mvcdemo.services.DonationService;

@RestController
@RequestMapping("/api")
public class APIController {

	@Autowired
	private DonationService donationService;
	
	@GetMapping("/donations") // get: /api/donations -- find all
	public List<Donation> findAllDonations(){
		return donationService.allDonations();
	}
	
	@PostMapping("/donations") // post: /api/donations -- create
	public Donation addDonation(
			@RequestParam("donationName") String donationName,
			@RequestParam("donor") String donor,
			@RequestParam("quantity")Integer quantity,
			@RequestParam("description") String description
			) {
		Donation newDonation = new Donation(donationName, donor, description, quantity);
		return donationService.createDonation(newDonation);
	}
	
	
	
	
	
}
