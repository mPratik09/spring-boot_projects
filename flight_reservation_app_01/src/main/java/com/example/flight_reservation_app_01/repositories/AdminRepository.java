package com.example.flight_reservation_app_01.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.flight_reservation_app_01.entity.Admin;

public interface AdminRepository extends JpaRepository<Admin, Long>{
	

}


