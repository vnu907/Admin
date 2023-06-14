package com.vaz.flight.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.vaz.flight.models.SeatStatus;


@Repository
public interface SeatStatusRepository extends JpaRepository<SeatStatus, Integer>{

	
	public SeatStatus findByFlightid(int flightid);
}
