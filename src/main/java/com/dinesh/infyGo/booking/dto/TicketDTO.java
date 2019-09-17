package com.dinesh.infyGo.booking.dto;

import java.util.Date;

import lombok.Data;

@Data
public class TicketDTO {
	private int pnr;

	private Date bookingDate;

	private Date departureDate;

	private String departureTime;


	private double totalFare;


	private String flightId;


	private String userId;

	private int noOfSeats;
}
