package com.example.ninjas.controllers;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.ninjas.models.Dojo;
import com.example.ninjas.models.Ninja;
import com.example.ninjas.services.DojoService;
import com.example.ninjas.services.NinjaService;

@Controller
public class NinjaController {
	
	@Autowired
	private DojoService dojoService;
	
	@Autowired
	private NinjaService ninjaService;
	
	@GetMapping("/ninjas")
	public String ninja(@ModelAttribute("ninja") Ninja ninja, Model model) {
		List<Ninja> ninjas = ninjaService.allNinjas();
		model.addAttribute("ninjas", ninjas);
		
		List<Dojo> dojos = dojoService.allDojos();
		model.addAttribute("dojos", dojos);
		
		return "createNinja.jsp";
	}
	
	@PostMapping("/ninjas/new") 
	public String createNinja(@Valid @ModelAttribute("ninja") Ninja ninja, BindingResult result, Model model) {
		if(result.hasErrors()) {
			return "createNinja.jsp";
		}else {
			ninjaService.createNinja(ninja);
			return "redirect:/ninjas";
		}
	}

}
