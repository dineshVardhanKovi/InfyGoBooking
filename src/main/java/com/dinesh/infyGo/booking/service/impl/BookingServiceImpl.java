package com.dinesh.infyGo.booking.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.dinesh.infyGo.booking.dto.PassengerDetails;
import com.dinesh.infyGo.booking.response.BookFlightResponse;
import com.dinesh.infyGo.booking.service.BookingService;

import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class BookingServiceImpl implements BookingService{
	
	@Autowired
	private RestTemplate restTemplate;
	
	
	@Override
	public BookFlightResponse bookFlight(String flightId, String userId, PassengerDetails passengerDetails) {
		return null;
	}

}
