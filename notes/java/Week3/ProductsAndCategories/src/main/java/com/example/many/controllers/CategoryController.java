package com.example.many.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class CategoryController {
	
	@GetMapping("/")
	public String index() {
		return "index.jsp";
	}

}
