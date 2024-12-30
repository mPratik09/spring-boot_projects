package com.example.flight_reservation_app_03.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.flight_reservation_app_03.entity.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
