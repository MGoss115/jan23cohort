package com.example.relationships.controllers;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.relationships.models.Person;
import com.example.relationships.services.PersonService;

@Controller
public class PersonController {
	
	@Autowired
	private PersonService personService;
	
	@GetMapping("/")
	public String index(@ModelAttribute("person") Person person, Model model) {
		List<Person> persons = personService.allPersons();
		model.addAttribute("persons", persons);
		return "index.jsp";
	}
	
	@PostMapping("/persons/new")
	public String createPerson(@Valid @ModelAttribute("person") Person person, BindingResult result, Model model) {
		if(result.hasErrors()) {
			return "index.jsp";
		}else {
			personService.createPerson(person);
			return "redirect:/";
		}
	}
	
	@GetMapping("/persons/{id}")
	public String showPerson(@PathVariable("id") Long id, Model model) {
		Person onePerson = personService.findPerson(id);
		model.addAttribute("onePerson", onePerson);
		return "showPerson.jsp";
	}

}
