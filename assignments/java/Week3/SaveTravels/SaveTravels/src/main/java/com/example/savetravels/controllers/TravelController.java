package com.example.savetravels.controllers;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;

import com.example.savetravels.models.Travel;
import com.example.savetravels.services.TravelService;

@Controller
public class TravelController {

	@Autowired
	TravelService travelService;

	@GetMapping("/")
	public String index(@ModelAttribute("travel") Travel travel, Model model) {
		List<Travel> travels = travelService.allTravels();
		model.addAttribute("travels", travels);
		return "index.jsp";
	}

	@PostMapping("/travels")
	public String create(@Valid @ModelAttribute("travel") Travel travel, BindingResult result, Model model) {
		if (result.hasErrors()) {
			return "index.jsp";
		} else {
			travelService.createTravel(travel);
			return "redirect:/";
		}
	}

	@GetMapping("/travel/{id}")
	public String travel(@PathVariable("id") Long id, Model model) {
		Travel travel = travelService.findTravel(id);
		model.addAttribute("travel", travel);
		return "show.jsp";
	}
	
	@GetMapping("/travels/{id}/edit")
	public String edit(@PathVariable("id") Long id, Model model) {
		Travel travel = travelService.findTravel(id);
		model.addAttribute("travel", travel);
		return "/edit.jsp";
	}


	@PutMapping("/travels/{id}")
	public String update(@Valid @ModelAttribute("travel") Travel travel, BindingResult result, Model model) {
		if (result.hasErrors()) {
			return "/edit.jsp";
		} else {
			travelService.updateTravel(travel);
			return "redirect:/";
		}
	}

	@DeleteMapping("/travel/{id}")
	public String destroy(@PathVariable("id") Long id) {
		travelService.deleteTravel(id);
		return "redirect:/";
	}

}
