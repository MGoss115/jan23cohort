package com.example.relationships.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.relationships.models.Person;
import com.example.relationships.repositories.PersonRepository;

@Service
public class PersonService {
	
	@Autowired
	private PersonRepository personRepository;
	
	// return all persons
	public List<Person> allPersons() {
		return personRepository.findAll();
	}
	
	// create a person
	public Person createPerson(Person person) {
		return personRepository.save(person);
	}
	
	// find one person
	public Person findPerson(Long id) {
		Optional<Person> optionalPerson = personRepository.findById(id);
		if(optionalPerson.isPresent()) {
			return optionalPerson.get();
		}else {
			return null;
		}
	}

}
