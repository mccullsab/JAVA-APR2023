package com.heidichen.mvcdemo.services;

import java.util.List;

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
	
	public List<Donation> allDonations(){
		return donationRepo.findAll();
	}
	
	
	public Donation createDonation(Donation newDonation) {
		return donationRepo.save(newDonation);
	}
	
	
}
