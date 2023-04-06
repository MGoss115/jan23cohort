package com.example.ninjas.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.ninjas.models.Dojo;
import com.example.ninjas.repositories.DojoRepository;

@Service
public class DojoService {
	
	@Autowired 
	private DojoRepository dojoRepository;
	
	// return all dojos
	public List<Dojo> allDojos() {
		return dojoRepository.findAll();
	}
	
	//create a dojo
	public Dojo createDojo(Dojo dojo) {
		return dojoRepository.save(dojo);
	}
	
	//find one dojo
	public Dojo findDojo(Long id) {
		Optional<Dojo> optionalDojo = dojoRepository.findById(id);
		if(optionalDojo.isPresent()) {
			return optionalDojo.get();
		}else {
			return null;
		}
	}

}
