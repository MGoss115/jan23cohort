package com.example.many.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.many.models.Product;

@Repository
public interface ProductRepository extends CrudRepository<Product, Long>{
	
	List<Product> findAll();

}
