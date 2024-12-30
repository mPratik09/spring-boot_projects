package com.example.flight_reservation_app_02.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.example.flight_reservation_app_02.entity.User;

public interface UserRepository extends JpaRepository<User, Long> {

	@Query
	User findByEmail(String email);
	
}
