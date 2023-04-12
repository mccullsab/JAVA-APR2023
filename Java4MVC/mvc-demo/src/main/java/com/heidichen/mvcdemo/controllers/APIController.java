package com.heidichen.mvcdemo.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.heidichen.mvcdemo.models.Donation;
import com.heidichen.mvcdemo.services.DonationService;

import jakarta.validation.Valid;



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

	@PostMapping("/donations2") 
	public Donation addDonation2(
			@Valid @ModelAttribute("newDonation") Donation newDonation, BindingResult result
			) {
		return donationService.createDonation(newDonation);
		// Donation newDonation = new Donation();
		// newDonation.setDonationName(donationName)
	}
	
	@GetMapping("/donations/{id}")
	public Donation oneDonation(@PathVariable("id")Long id) {
		return donationService.findDonation(id);
	}
	
	// Update
	@PutMapping("/donations/{id}")
	public Donation editDonation(
			@PathVariable("id")Long id,
			@RequestParam("donationName") String donationName,
			@RequestParam("donor") String donor,
			@RequestParam("quantity")Integer quantity,
			@RequestParam("description") String description
			) {
		Donation oneDonation = donationService.findDonation(id);
		oneDonation.setDescription(description);
		oneDonation.setDonationName(donationName);
		oneDonation.setDonor(donor);
		oneDonation.setQuantity(quantity);
		return donationService.updateDonation(oneDonation);
	}
	
	@PutMapping("/donations2/{id}")
	public Donation editDonation2(
			@PathVariable("id")Long id,
			@Valid @ModelAttribute("oneDonation") Donation oneDonation, BindingResult result
			) {
		return donationService.updateDonation(oneDonation);
	}
	
	
	// Delete
	@DeleteMapping("/donations/{id}")
	public void deleteDonation(@PathVariable("id")Long id) {
		donationService.removeDonation(id);
	}
	
	
	
	
	
	
}















