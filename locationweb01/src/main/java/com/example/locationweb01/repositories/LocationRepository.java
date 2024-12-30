package com.example.locationweb01.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.locationweb01.entities.Location;

public interface LocationRepository extends JpaRepository<Location, Long> {

}
