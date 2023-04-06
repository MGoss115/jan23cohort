package com.example.relationships.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.relationships.models.License;
import com.example.relationships.repositories.LicenseRepository;

@Service
public class LicenseService {
	
	@Autowired
	private LicenseRepository licenseRepository;
	
	// returns all license
	public List<License> allLicense() {
		return licenseRepository.findAll();
	}
	
	//creates a new License
	public License createLincese(License license) {
		return licenseRepository.save(license);
	}

}
