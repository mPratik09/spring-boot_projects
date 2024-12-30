package com.example.flight_reservation_app_02.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.flight_reservation_app_02.entity.Passenger;

public interface PassengerRepository extends JpaRepository<Passenger, Long> {

}
