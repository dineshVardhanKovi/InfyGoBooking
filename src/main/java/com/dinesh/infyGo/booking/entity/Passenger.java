package com.dinesh.infyGo.booking.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

import lombok.Data;

@Entity
@Table(name = "PASSENGER_DETAILS")
@Data
public class Passenger {
	
	@Id
	@GenericGenerator(name = "passengerIdSequence", strategy = "increment")
	@GeneratedValue(generator = "passengerIdSequence")
	@Column(name = "passenger_id")
	private int passengerId;
	
	@Column(name = "name")
	private String passengerName;
	
	@Column(name = "age")
	private String passengerAge;
	
	@Column(name = "gender")
	private String passengerGender;
	@OneToOne
	@JoinColumn
	private Ticket ticket;
}
