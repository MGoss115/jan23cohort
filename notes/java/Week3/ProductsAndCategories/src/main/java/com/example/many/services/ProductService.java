package com.example.many.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.many.models.Category;
import com.example.many.models.Product;
import com.example.many.repositories.ProductRepository;

@Service
public class ProductService {
	
	@Autowired
	private ProductRepository productRepository;
	
	public List<Product> allProducts() {
		return productRepository.findAll();
	}
	
	public Product createProd(Product product) {
		return productRepository.save(product);
	}
	
	public Product updateProd(Product product) {
		return productRepository.save(product);
	}
	
	  //find by id
    public Product findProduct(Long id) {
    	Optional<Product>optionalProduct = productRepository.findById(id);
    	if(optionalProduct.isPresent()) {
    		return optionalProduct.get();
    	}else {
    		return null;
    	}
    }
    
	public List<Product> getAssignedProducts(Category category){
		return productRepository.findAllByCategories(category);
	}
	
	public List<Product> getUnassignedProducts(Category category){
		return productRepository.findByCategoriesNotContains(category);
	}
    
  //delete a book
  	public void deleteProduct(Long id) {
  		productRepository.deleteById(id);
  	}
}
