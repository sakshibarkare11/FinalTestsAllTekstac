package com.service;

import java.util.List;

import com.entities.Laptop;
import com.exception.InvalidDealerException;
import com.exception.InvalidLaptopException;

public interface ILaptopService {
    
    
    public Laptop addLaptop(Laptop laptop, String dealerId) throws InvalidDealerException;
    
    
    public Laptop updateAvailabilityStatus(String laptopId, String availabilityStatus) throws InvalidLaptopException;
    
   
    public List<Laptop> viewLaptopsWithRam(int ram);
    
   
    public List<Laptop> viewLaptopsByDealerId(String dealerId);
    
    
    public Laptop scrapALap(String laptopId) throws InvalidLaptopException;
}
