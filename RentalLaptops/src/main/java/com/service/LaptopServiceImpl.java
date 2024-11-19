package com.service;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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
       // Fill the code
//    	Laptop l = laptopRepository.findById(dealerId).orElseThrow(()-> new InvalidDealerException());
//    	laptop.setLaptopId(dealerId);
		return laptopRepository.save(laptop);
    }

   
    public Laptop updateAvailabilityStatus(String laptopId, String availabilityStatus) throws InvalidLaptopException {
      // Fill the code
    	Laptop lapt = laptopRepository.findById(laptopId).orElseThrow(()-> new InvalidLaptopException());
    	lapt.setAvailabilityStatus(availabilityStatus);
		return laptopRepository.save(lapt);
//		return null;
		//correct
    }

   
    public List<Laptop> viewLaptopsWithRam(int ram) {
       // Fill the code findByramgreaterthanequal
//		return laptopRepository.findByRamGreaterThanEqual(ram);
    	return null;
    }
   
    public List<Laptop> viewLaptopsByDealerId(String dealerId) {
        // Fill the code
		return null;
    }

   
    public Laptop scrapALap(String laptopId) throws InvalidLaptopException {
       // Fill the code
    	Laptop l = laptopRepository.findById(laptopId).orElseThrow(()-> new InvalidLaptopException());
    	laptopRepository.deleteById(laptopId);
		return l;
//    	return null;
    }
}
