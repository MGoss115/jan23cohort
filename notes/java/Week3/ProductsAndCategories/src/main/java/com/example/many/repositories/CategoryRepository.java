package com.example.many.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.many.models.Category;
import com.example.many.models.Product;

@Repository
public interface CategoryRepository extends CrudRepository<Category, Long> {
	
	List<Category> findAll();
	Category findByIdIs(Long id);
	// Retrieves a list of all categories for a particular product
    List<Category> findAllByProducts(Product product);
    
    // Retrieves a list of any categories a particular product
    // does not belong to.
    List<Category> findByProductsNotContains(Product product);

}
