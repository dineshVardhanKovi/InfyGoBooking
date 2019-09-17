package com.dinesh.infyGo.booking.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.springframework.format.annotation.DateTimeFormat;

import lombok.Data;

@Entity
@Table(name="TICKET_DETAILS")
@Data
public class Ticket {
	
	@Id
	@Column(name="pnr")
	private int pnr;
	
	@Temporal(TemporalType.DATE)
	@Column(name="booking_date")
	private Date bookingDate;
	
	@DateTimeFormat(pattern = "dd-mm-yyyy")
	@Temporal(TemporalType.DATE)
	@Column(name="departure_date")
	private Date departureDate;
	
	@Column(name="departure_time")
	private String departureTime;
	
	@Column(name="total_fare")
	private double totalFare;
	
	@Column(name="flight_id")
	private String flightId;
	
	@Column(name="user_id")
	private String userId;
	
	@Column(name="no_of_seats")
	private int noOfSeats;
}
