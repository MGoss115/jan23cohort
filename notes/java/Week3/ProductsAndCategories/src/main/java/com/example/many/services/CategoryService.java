package com.example.many.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.many.models.Category;
import com.example.many.models.Product;
import com.example.many.repositories.CategoryRepository;

@Service
public class CategoryService {
	@Autowired
	private CategoryRepository categoryRepository;
	
	public Category create(Category category) {
		return categoryRepository.save(category);
	}
	
	public List<Category> getAllCat(){
		return categoryRepository.findAll();
	}

	public Category findCategory(Long id) {
		Optional<Category> optionalCategory = categoryRepository.findById(id);
		if(optionalCategory.isPresent()) {
			return optionalCategory.get();
		}else {
			return null;
		}
	}
	
	public List<Category> findByCategories(Product product) {
		return categoryRepository.findAllByProducts(product);
	}
	
	public List<Category> findByNotContainsCategories(Product product) {
		return categoryRepository.findByProductsNotContains(product);
	}
	
	public Category updateCat(Category category) {
		return categoryRepository.save(category);
	}
	
	public void deleteCat(Category category) {
		categoryRepository.delete(category);
	}
}
