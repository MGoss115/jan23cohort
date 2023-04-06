package com.example.burgertracker.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.example.burgertracker.models.Burger;
import com.example.burgertracker.repositories.BurgerRepository;

@Service
public class BurgerService {
	
	private final BurgerRepository burgerRepository;
	
	public BurgerService(BurgerRepository burgerRepository) {
		this.burgerRepository = burgerRepository;
	}
	
	// returns all burger
	public List<Burger> allburgers() {
		return burgerRepository.findAll();
	}
	
	// creates a burger
    public Burger createBurger(Burger b) {
        return burgerRepository.save(b);
    }
    
    // update a burger
    public Burger updateBurger(Burger b) {
    	return burgerRepository.save(b);
    }
    
    //find by id
    public Burger findBurger(Long id) {
    	Optional<Burger>optionalBurger = burgerRepository.findById(id);
    	if(optionalBurger.isPresent()) {
    		return optionalBurger.get();
    	}else {
    		return null;
    	}
    }
}
