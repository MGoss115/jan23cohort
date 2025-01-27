package com.example.auth.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.auth.models.User;

@Repository
public interface UserRepository extends CrudRepository<User, Long> {
	
//	List<User> getAll();

	User findByUsername(String username);

	void save(org.springframework.boot.autoconfigure.security.SecurityProperties.User user);

	
}
