package com.example.savetravels.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.example.savetravels.models.Travel;
import com.example.savetravels.repositories.TravelRepository;

@Service 
public class TravelService {
	
	private final TravelRepository travelRepository;
	
	public TravelService(TravelRepository travelRepository) {
		this.travelRepository = travelRepository;
	}
	
	//returns all travels
	public List<Travel>allTravels() {
		return travelRepository.findAll();
	}
	
	//create travel
	public Travel createTravel(Travel travel) {
		return travelRepository.save(travel);
	}
	
	//find travel by id
	public Travel findTravel(Long id) {
		Optional<Travel> optionalTravel = travelRepository.findById(id);
		if(optionalTravel.isPresent()) {
			return optionalTravel.get();
		}else {
			return null;
		}
	}
	
	//create travel
	public Travel updateTravel(Travel travel) {
		return travelRepository.save(travel);
	}

	public void deleteTravel(Long id) {
		travelRepository.deleteById(id);
	}

}
