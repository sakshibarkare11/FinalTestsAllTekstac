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

       // fill code
    	Dealer deal = dealerRepository.findById(dealerId).orElseThrow(()-> new InvalidDealerException());
    	deal.setRating(rating);
	    return dealerRepository.save(deal);
	    //correct
    }

 
    public Dealer viewDealerById(String dealerId) throws InvalidDealerException {
       
	// fill code
	    return dealerRepository.findById(dealerId).orElseThrow(()-> new InvalidDealerException());
//    	return null;
	    //correct
    }

    
    public List<Dealer> viewDealersByLocationAndBrand(String location, String authorizedBrand) {
        
	// fill code
//	    return dealerRepository.findDealerByLocationAndBrand(location, authorizedBrand);
    	return null;
    }

  
    public Map<String, Integer> getAvailableLaptopCountDealerWise() {
       
	// fill code
	    return null;
    }

}
