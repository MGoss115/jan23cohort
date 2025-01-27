package com.example.relationships.controllers;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.relationships.models.License;
import com.example.relationships.models.Person;
import com.example.relationships.services.LicenseService;
import com.example.relationships.services.PersonService;

@Controller
public class LicenseController {
	
	@Autowired
	private LicenseService licenseService;
	
	@Autowired
	private PersonService personService;
	
	@GetMapping("/licenses")
	public String license(@ModelAttribute("license") License license, Model model) {
		List<License> licenses = licenseService.allLicense();
		model.addAttribute("licenses", licenses);
		
		List<Person> persons = personService.allPersons();
		model.addAttribute("persons", persons);
	
		return "createLicense.jsp";
	}
	
	@PostMapping("/licenses/new")
	public String createLicense(@Valid @ModelAttribute("license") License license, BindingResult result, Model model) {
		
		if(result.hasErrors()) {
			return "createLicense.jsp";
		}else {
			licenseService.createLincese(license);
			return "redirect:/licenses";
		}
	}

}
