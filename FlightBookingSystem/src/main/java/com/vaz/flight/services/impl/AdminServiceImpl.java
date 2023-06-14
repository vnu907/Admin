package com.vaz.flight.services.impl;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.vaz.flight.models.Customer;
import com.vaz.flight.models.FlightDetails;
import com.vaz.flight.models.Seat;
import com.vaz.flight.services.AdminService;
import com.vaz.flight.services.CustomerService;
import com.vaz.flight.services.FlightService;
import com.vaz.flight.services.SeatService;


@Transactional
@Service
public class AdminServiceImpl implements AdminService{
	
	
	@Autowired
	private CustomerService customerService;

	@Override
	public List<Customer> getAllCustomerDetails() {
		return customerService.getAllCustomerDetailsExceptAdmin();
	}

	
}
