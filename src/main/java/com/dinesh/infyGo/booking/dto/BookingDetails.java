package com.dinesh.infyGo.booking.dto;

import java.util.List;

import lombok.Data;

@Data
public class BookingDetails {
	private int pnr;
	private double totalFare;

	private List<PassengerDTO> passengerList;
}
