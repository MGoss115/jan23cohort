package com.example.ninjas.controllers;

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

import com.example.ninjas.models.Dojo;
import com.example.ninjas.services.DojoService;

@Controller
public class DojoController {
	
	@Autowired
	private DojoService dojoService;

	
	@GetMapping("/")
	public String index(@ModelAttribute("dojo") Dojo dojo, Model model) {
		List<Dojo> dojos = dojoService.allDojos();
		model.addAttribute("dojos", dojos);
		return "index.jsp";
	}
	
	@PostMapping("/dojos/new")
	public String createDojo(@Valid @ModelAttribute("dojo") Dojo dojo, BindingResult result, Model model) {
		if(result.hasErrors()) {
			return "index.jsp";
		}else {
			dojoService.createDojo(dojo);
			return "redirect:/";
		}
	}
	
	@GetMapping("/dojos/{id}")
	public String showDojo(@PathVariable("id") Long id, Model model) {
		Dojo oneDojo = dojoService.findDojo(id);
		model.addAttribute("oneDojo", oneDojo);

		return "showDojo.jsp";
	}

}
