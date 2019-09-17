package com.dinesh.infyGo.booking.dto;


import com.dinesh.infyGo.booking.entity.Ticket;

import lombok.Data;

@Data
public class PassengerDTO {
	private int passengerId;

	private String passengerName;

	private String passengerAge;

	private String passengerGender;

	private TicketDTO ticket;
}
