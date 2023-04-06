package com.example.ninjas.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.ninjas.models.Ninja;
import com.example.ninjas.repositories.NinjaRepository;

@Service
public class NinjaService {
	
	@Autowired
	private NinjaRepository ninjaRepository;
	
	// return all Ninjas
	public List<Ninja> allNinjas() {
		return ninjaRepository.findAll();
	}
	
	//creates a new ninja
	public Ninja createNinja(Ninja ninja) {
		return ninjaRepository.save(ninja);
	}

}
