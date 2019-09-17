package com.dinesh.infyGo.booking.repository;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dinesh.infyGo.booking.entity.Ticket;

public interface TicketRepository extends JpaRepository<Ticket, Serializable>{

}
