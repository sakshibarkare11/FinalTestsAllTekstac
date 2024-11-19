package com.service;

import java.util.List;
import java.util.Map;

import com.entities.Dealer;
import com.exception.InvalidDealerException;

public interface IDealerService {
    
   
    public Dealer addDealer(Dealer dealer);
    
    public Dealer updateRating(String dealerId, int rating) throws InvalidDealerException;
    
    public Dealer viewDealerById(String dealerId) throws InvalidDealerException;
    
    public List<Dealer> viewDealersByLocationAndBrand(String location, String authorizedBrand);
    
    public Map<String, Integer> getAvailableLaptopCountDealerWise();
}
