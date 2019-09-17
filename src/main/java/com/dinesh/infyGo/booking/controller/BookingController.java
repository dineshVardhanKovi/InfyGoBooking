package com.dinesh.infyGo.booking.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dinesh.infyGo.booking.constants.InfyGoBookingConstants;
import com.dinesh.infyGo.booking.dto.PassengerDetails;
import com.dinesh.infyGo.booking.response.BookFlightResponse;
import com.dinesh.infyGo.booking.service.BookingService;

import lombok.extern.slf4j.Slf4j;

@RestController
@RequestMapping(InfyGoBookingConstants.BASE_PATH + InfyGoBookingConstants.BOOK)
@Slf4j
public class BookingController {

	@Autowired
	private BookingService bookingService;

	@PostMapping(value = "/{flightId}/{userId}",produces = "application/json", consumes = "application/json")
	public ResponseEntity<BookFlightResponse> bookFlight(@PathVariable("flightId") String flightId,@PathVariable("userId") String userId,
			@RequestBody PassengerDetails passengerDetails){
		ResponseEntity<BookFlightResponse>  responseEntity = null;
		try {
			responseEntity = new ResponseEntity<BookFlightResponse>(bookingService.bookFlight(flightId, userId, passengerDetails),HttpStatus.OK);
		} catch (Exception e) {
			log.error("Exception occured in BookingController.bookFlight() : " + e.getMessage());
			responseEntity = new ResponseEntity<BookFlightResponse>(HttpStatus.INTERNAL_SERVER_ERROR);		
		}
		return responseEntity;
	}
}
