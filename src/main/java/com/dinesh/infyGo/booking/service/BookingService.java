package com.dinesh.infyGo.booking.service;

import com.dinesh.infyGo.booking.dto.PassengerDetails;
import com.dinesh.infyGo.booking.response.BookFlightResponse;

public interface BookingService {
	BookFlightResponse bookFlight(String flightId,String userId,PassengerDetails passengerDetails);
}
