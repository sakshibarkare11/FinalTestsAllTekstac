package com.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.entities.Dealer;

//Provide necessary annotation
@Repository
public interface DealerRepository extends JpaRepository<Dealer, String>  {	
	
	// Provide necessary methods to view dealers by location and brand and to view available laptop count dealerwise
//	List<Dealer> findDealerByLocationAndBrand(String location, String authorizedBrand);
	
}
