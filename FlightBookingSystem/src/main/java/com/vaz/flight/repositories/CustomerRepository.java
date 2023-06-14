package com.vaz.flight.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;


import com.vaz.flight.models.Customer;
public interface CustomerRepository  extends JpaRepository<Customer, Integer> {
public Customer findByUsername(String username);
	
	@Modifying(clearAutomatically = true)
	@Query("update Customer u set u.enabled = :enabled where u.customerid =:customerid")
	public void updateCustomerByEnabled(@Param("enabled") Boolean enabled, @Param("customerid") int customerid);
	
	public List<Customer> findByRole(String Role);

}
