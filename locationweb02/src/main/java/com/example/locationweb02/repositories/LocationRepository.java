package com.example.locationweb02.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.locationweb02.entities.Location;

public interface LocationRepository extends JpaRepository<Location, Long> {

}
