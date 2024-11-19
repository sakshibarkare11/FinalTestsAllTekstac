package com.service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.entities.Dealer;
import com.exception.InvalidDealerException;
import com.repository.DealerRepository;

@Service
public class DealerServiceImpl implements IDealerService {

   // Provide necessary Annotation
	@Autowired
    private DealerRepository dealerRepository;

    
    public Dealer addDealer(Dealer dealer) {

        // fill code
	    return dealerRepository.save(dealer);
    }

  
    public Dealer updateRating(String dealerId, int rating) throws InvalidDealerException {
    	Dealer d = dealerRepository.findById(dealerId).orElseThrow(() -> new InvalidDealerException());
    	d.setRating(rating);
       // fill code
	    return dealerRepository.save(d);
    }

 
    public Dealer viewDealerById(String dealerId) throws InvalidDealerException {
       Dealer dealer=dealerRepository.findById(dealerId).orElseThrow(() -> new InvalidDealerException());
	// fill code
	    return dealer;
    }

    
    public List<Dealer> viewDealersByLocationAndBrand(String location, String authorizedBrand) {
        
	// fill code
	    return dealerRepository.findByLocationAndAuthorizedBrand(location,authorizedBrand);
    }

  
    public Map<String, Integer> getAvailableLaptopCountDealerWise() {
       
	// fill code
	    return null;
    }

}
