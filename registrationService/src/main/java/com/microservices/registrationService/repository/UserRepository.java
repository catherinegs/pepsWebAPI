package com.microservices.registrationService.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.microservices.registrationService.model.User;

public interface UserRepository extends JpaRepository<User, Long> {
	
	User findByEmail(String email);

}
