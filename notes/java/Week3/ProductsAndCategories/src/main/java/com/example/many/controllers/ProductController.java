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
public class ProductController {
	
	@Autowired
	private ProductService productService;
	
	@Autowired
	private CategoryService categoryService;

	@GetMapping("/new")
	public String addProduct(@ModelAttribute("product") Product product, Model model) {
		return "addProd.jsp";
	}
	
	@PostMapping("/create")
	public String createProd(@Valid @ModelAttribute("product") Product product, BindingResult result, Model model) {
		if(result.hasErrors()) {
			return "addProd.jsp";
		} else {
			productService.createProd(product);
			return "redirect:/";
		}
	}

	@GetMapping("/product/{id}")
	public String travel(@PathVariable("id") Long id, @ModelAttribute("products") Product products, Model model) {
		Product product = productService.findProduct(id);
		model.addAttribute("product", product);
		
		List<Category> cat = categoryService.findByCategories(product);
		model.addAttribute("cat", cat);
		
		List<Category> category = categoryService.findByNotContainsCategories(product);
		model.addAttribute("category", category);
		
		return "product.jsp";
	}
	
	@PostMapping("/product/{id}")
	public String update(@PathVariable("id") Long id, @RequestParam("categoryId") Long categoryId, Model model) {
		Product product = productService.findProduct(id);
		Category category = categoryService.findCategory(categoryId);
		product.getCategories().add(category);
		productService.updateProd(product);
		return "redirect:/product/"+id;
	}

}
