package com.example.many.controllers;

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
import org.springframework.web.bind.annotation.RequestParam;

import com.example.many.models.Category;
import com.example.many.models.Product;
import com.example.many.services.CategoryService;
import com.example.many.services.ProductService;

@Controller
public class CategoryController {
	
	@Autowired
	private CategoryService categoryService;
	
	@Autowired
	private ProductService productService;
	
	@GetMapping("/")
	public String index(@ModelAttribute("category") Category category, Model model) {
		List<Category> categories = categoryService.getAllCat();
		model.addAttribute("categories", categories);
		
		List<Product> products = productService.allProducts();
		model.addAttribute("products", products);
		
		return "index.jsp";
	}
	
	@GetMapping("/newCat")
	public String addCat(@ModelAttribute("category") Category category, Model model) {
		return "addCat.jsp";
	}
	
	@PostMapping("/createCat")
	public String createCat(@Valid @ModelAttribute("category") Category category, BindingResult result, Model model) {
		if(result.hasErrors()) {
			return "addCat.jsp";
		} else {
			categoryService.create(category);
			return "redirect:/";
		}
	}
	
	@GetMapping("/category/{id}")
	public String travel(@PathVariable("id") Long id, Model model) {
		Category category = categoryService.findCategory(id);
		model.addAttribute("category", category);
		
		List<Product> prod = productService.getAssignedProducts(category);
		model.addAttribute("prod", prod);
		
		List<Product> products = productService.getUnassignedProducts(category);
		model.addAttribute("products", products);
		
		return "category.jsp";
	}
	
	@PostMapping("/category/{id}")
	public String updateCategory(@PathVariable("id") Long id, @RequestParam("productId") Long productId, Model model) {
		Category category = categoryService.findCategory(id);
		Product product = productService.findProduct(productId);
		category.getProducts().add(product);
		categoryService.updateCat(category);
		return "redirect:/category/"+id;
	}

}
