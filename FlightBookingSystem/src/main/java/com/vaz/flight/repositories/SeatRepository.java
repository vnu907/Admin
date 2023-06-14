package com.vaz.flight.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.vaz.flight.models.Seat;

@Repository
public interface SeatRepository extends JpaRepository<Seat, Integer>{

	public Seat findBySeatclassAndFlightid(String seatclass, Integer flightid);
	public List<Seat> findByFlightid(Integer flightid);

}
