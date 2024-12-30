package com.example.flight_reservation_app_03.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.flight_reservation_app_03.entity.Users;

public interface UsersRepository extends JpaRepository<Users, Long> {

}
