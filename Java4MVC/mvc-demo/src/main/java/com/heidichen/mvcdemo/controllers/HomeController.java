package com.heidichen.mvcdemo.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;

import com.heidichen.mvcdemo.models.Donation;
import com.heidichen.mvcdemo.services.DonationService;

import jakarta.validation.Valid;

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
	
	@GetMapping("/donations/new")
	public String renderCreateForm(Model model) {
		// alternative: @ModelAttribute("newDonation") Donation newDonation to create empty Donation
		Donation newDonation = new Donation();
		model.addAttribute("newDonation", newDonation);
		return "createPage.jsp";
	}

	@PostMapping("/donations/new")
	public String processCreateForm(
			@Valid @ModelAttribute("newDonation") Donation newDonation, 
			BindingResult result
			) {
		if(result.hasErrors()) {
			return "createPage.jsp";
		}else {
			donationService.createDonation(newDonation);
			return "redirect:/donations";
			
		}
	}
	
	// EDIT 
	// Render edit form
	@GetMapping("/donations/edit/{id}")
	public String renderEditForm(
			@PathVariable("id")Long id,
			Model model) {
		Donation oneDonation = donationService.findDonation(id);
		model.addAttribute("oneDonation", oneDonation);
		return "editPage.jsp";
	}
	
	// process edit form
	@PutMapping("/donations/edit/{id}")
	public String processEditForm(
			@PathVariable("id") Long id,
			@Valid @ModelAttribute("oneDonation") Donation oneDonation,
			BindingResult result
			) {
		if(result.hasErrors()) {
			return "editPage.jsp";
		}else {
			donationService.updateDonation(oneDonation);
			return "redirect:/donations/{id}";
		}
	}
	
	@DeleteMapping("/donations/{id}")
	public String deleteDonation(@PathVariable("id")Long id) {
		donationService.removeDonation(id);
		return "redirect:/donations";
	}
}













