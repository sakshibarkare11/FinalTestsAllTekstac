package com.service;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.entities.Dealer;
import com.entities.Laptop;
import com.exception.InvalidLaptopException;
import com.exception.InvalidDealerException;
import com.repository.LaptopRepository;
import com.repository.DealerRepository;

@Service
public class LaptopServiceImpl implements ILaptopService {

    // Provide necessary Annotation
	@Autowired
    private LaptopRepository laptopRepository;

    // Provide necessary Annotation
	@Autowired
    private DealerRepository dealerRepository;

   
    public Laptop addLaptop(Laptop laptop, String dealerId) throws InvalidDealerException {
    	Dealer dealer=dealerRepository.findById(dealerId).orElseThrow(() -> new InvalidDealerException());
    	laptop.setDealerObj(dealer);
       // Fill the code
		return laptopRepository.save(laptop) ;
    }

   
    public Laptop updateAvailabilityStatus(String laptopId, String availabilityStatus) throws InvalidLaptopException {
      // Fill the code
    	Laptop l=laptopRepository.findById(laptopId).orElseThrow(() -> new InvalidLaptopException());
    	l.setAvailabilityStatus(availabilityStatus);
		return laptopRepository.save(l);
    }

   
    public List<Laptop> viewLaptopsWithRam(int ram) {
    	return laptopRepository.findByRamGreaterThanEqual(ram);
       // Fill the code
		
    }
   
    public List<Laptop> viewLaptopsByDealerId(String dealerId) {
        // Fill the code
		return laptopRepository.findByDealerObj_dealerId(dealerId);
    }

   
    public Laptop scrapALap(String laptopId) throws InvalidLaptopException {
    	Laptop l=laptopRepository.findById(laptopId).orElseThrow(() -> new InvalidLaptopException());
    	laptopRepository.delete(l);
       // Fill the code
		return l;
    }
}
