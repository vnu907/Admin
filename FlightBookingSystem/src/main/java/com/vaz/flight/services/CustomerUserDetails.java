package com.vaz.flight.services;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.vaz.flight.models.Customer;
import com.vaz.flight.repositories.CustomerRepository;
import com.vaz.flight.security.CustomCustomerUserDetails;


@Service
public class CustomerUserDetails implements UserDetailsService {
	@Autowired
	private CustomerRepository customerRepository;

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		/* System.out.println(username); */
		Customer customer = customerRepository.findByUsername(username);
		if (customer == null) {
			throw new UsernameNotFoundException("User details not found for the user : " + username);
		}
		/* System.out.println(customer.size()); */
		return new CustomCustomerUserDetails(customer);
	}
	
}
