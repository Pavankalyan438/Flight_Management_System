package com.capgemini.flight.DAO;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.capgemini.flight.entity.FlightEntity;

@Repository // @Repository is a marker annotation, which indicates that the underlying
			// interface is a repository
/**
 * JpaRepository contains methods for performing CRUD operations
 */
public interface FlightDAO extends JpaRepository<FlightEntity, Integer> { 
	
}
