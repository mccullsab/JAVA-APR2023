package com.heidichen.mvcdemo.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.heidichen.mvcdemo.models.Donation;
import com.heidichen.mvcdemo.repositories.DonationRepository;

@Service
public class DonationService {

	// import repository
//	private final DonationRepository donationRepo;
//	
//	public DonationService(DonationRepository donationRepo) {
//		this.donationRepo = donationRepo;
//	}
	
	@Autowired
	private DonationRepository donationRepo;
	
	// ----- FIND ALL ------
	public List<Donation> allDonations(){
		return donationRepo.findAll();
	}
	
	// ----- CREATE ------	
	public Donation createDonation(Donation newDonation) {
		return donationRepo.save(newDonation);
	}
	
	
	// ----- FIND ONE ------	
	public Donation findDonation(Long id) {
		Optional<Donation> optionalDonation=  donationRepo.findById(id);
		if(optionalDonation.isPresent()) {
			return optionalDonation.get();
		}else {
			return null;
		}
	}
	
	// ----- UPDATE ------	
	public Donation updateDonation(Donation oneDonation) {
		return donationRepo.save(oneDonation);
	}
	
	// ----- DELETE ------	
	public void removeDonation(Long id) {
		donationRepo.deleteById(id);
	}
	
	
}











