package com.dinesh.infyGo.booking.repository;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.dinesh.infyGo.booking.entity.Passenger;

@Repository
public interface PassengerRepository extends JpaRepository<Passenger, Serializable>{
	
}
