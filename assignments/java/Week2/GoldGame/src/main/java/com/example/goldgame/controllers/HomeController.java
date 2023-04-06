package com.example.goldgame.controllers;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
public class HomeController {

	@RequestMapping("/")
	public String index(HttpSession session) {
		return "counter.jsp";
	}

	@RequestMapping("/results")
	public String results(HttpSession session) {
		return "index.jsp";
	}

	@PostMapping("/")
	public String farm(HttpSession session, RedirectAttributes redirectAttributes) {
		Integer count = 0;
		if (session.getAttribute("count") == null) {
			session.setAttribute("count", 15);
		} else {
			count = (Integer) session.getAttribute("count");
			count = count + 15;
			session.setAttribute("count", count);

		}
		redirectAttributes.addFlashAttribute("output", "You entered a farm and earned 15 gold");
		return "redirect:/results";
	}

	@PostMapping("/cave")
	public String cave(HttpSession session, RedirectAttributes redirectAttributes) {
		Integer count = 0;
		if (session.getAttribute("count") == null) {
			session.setAttribute("count", 5);
		} else {
			count = (Integer) session.getAttribute("count");
			count = count + 5;
			session.setAttribute("count", count);

		}
		redirectAttributes.addFlashAttribute("output", "You entered a cave and earned 5 gold");
		return "redirect:/results";
	}

	@PostMapping("/house")
	public String house(HttpSession session, RedirectAttributes redirectAttributes) {
		Integer count = 0;
		if (session.getAttribute("count") == null) {
			session.setAttribute("count", 2);
		} else {
			count = (Integer) session.getAttribute("count");
			count = count + 2;
			session.setAttribute("count", count);

		}
		redirectAttributes.addFlashAttribute("output", "You entered a house and earned 2 gold");
		return "redirect:/results";
	}

	@PostMapping("/quest")
	public String quest(HttpSession session, RedirectAttributes redirectAttributes) {
		Integer count = 0;
		if (session.getAttribute("count") == null) {
			session.setAttribute("count", 25);
		} else {
			count = (Integer) session.getAttribute("count");
			count = count - 25;
			session.setAttribute("count", count);

		}
		redirectAttributes.addFlashAttribute("output", "You failed a quest and lost 25 gold");
		return "redirect:/results";
	}

}

// @PostMapping("gold/{place}")
// public String gold(@PathVariable String place, HttpSession session, Model
// model) {
// LocalDateTime ldt = LocalDateTime.now(); // used to set time in string later

// // change the gold value
// int change = 0;
// switch(place) {
// case "farm":
// change = 10 + (int)(Math.random() * 20);
// break;
// case "cave":
// change = 5 + (int)(Math.random() * 10);
// break;
// case "house":
// change = 2 + (int)(Math.random() * 5);
// break;
// case "quest":
// change = 50 - (int)(Math.random() * 100);
// break;
// default:
// break;
// }

// add an activity string
// ArrayList<String> activities;
// if(session.getAttribute("activities") == null) {
// activities = new ArrayList<String>();
// String sessionVar = (String)session.getAttribute("activities");
// System.out.println("MAKING NEW LIST");
// System.out.println(sessionVar);
// }
// else {
// activities = (ArrayList<String>) session.getAttribute("activities");
// }

// if(change < 0) {
// activities.add(0, "You failed a " + place + " and lost " + -change + " gold.
// Ouch. (" + "time" + ")\n");
// }
// else {
// activities.add(0, "You entered a " + place + " and earned " + change + "
// gold. (" + "time" + ")\n");
// }

// update session values
// int count = change + (int)session.getAttribute("count");
// session.setAttribute("count", count);
// session.setAttribute("activities", activities);

// return "redirect:/";
// }
