package com.vaz.flight.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.vaz.flight.models.User;


@Repository
	public interface UserRepository extends JpaRepository<User, Long> {
		public User findByUsername(String username);
}
