package com.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.entities.Laptop;

//Provide necessary annotation
@Repository
public interface LaptopRepository extends JpaRepository<Laptop, String> {

		// Provide necessary methods to view laptops with RAM greater than or equal to the given value and to view laptops by dealer ID

	//	List<Laptop> findLaptopsByDealerId(String dealerId);
//		List<Laptop> findByRamGreaterThanEqual(int ram);
  
	
}
