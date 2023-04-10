package com.example.exam.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.exam.models.Person;
import com.example.exam.repositories.PersonRepository;

@Service
public class PersonService {
	
	@Autowired
	private PersonRepository personRepository;
	
	//returns all travels
	public List<Person>allPersons() {
		return personRepository.findAll();
	}
	
	//create a person
	public Person createPerson(Person person) {
		return personRepository.save(person);
	}
	
	//find person by id
	public Person findPerson(Long id) {
		Optional<Person> optionalPerson = personRepository.findById(id);
		if(optionalPerson.isPresent()) {
			return optionalPerson.get();
		}else {
			return null;
		}
	}
	
	//update a person
	public Person updatePerson(Person person) {
		return personRepository.save(person);
	}

	public void deletePerson(Long id) {
		personRepository.deleteById(id);
	}
}
