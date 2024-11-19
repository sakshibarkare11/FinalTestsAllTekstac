package com.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.entities.Dealer;
import com.exception.InvalidDealerException;
import com.service.IDealerService;

import jakarta.validation.Valid;

//Provide necessary Annotation
@RestController
public class DealerController {
   //Provide necessary Annotation
	@Autowired
    private IDealerService dealerService;
    
    // Provide necessary Annotation and fill code in the below methods
	@PostMapping("addDealer")
    public ResponseEntity<Dealer> addDealer(@Valid @RequestBody Dealer dealer) {
        
        return new ResponseEntity<Dealer>(dealerService.addDealer(dealer),HttpStatus.OK);
    }
    
	@PutMapping("/updateRating/{dealerId}/{rating}")
    public ResponseEntity<Dealer> updateRating(@PathVariable String dealerId,@PathVariable  int rating) throws InvalidDealerException {
        return new ResponseEntity<Dealer>(dealerService.updateRating(dealerId, rating),HttpStatus.OK);
    }
    
	@GetMapping("/viewDealerById/{dealerId}")
    public ResponseEntity<Dealer> viewDealerById(@PathVariable String dealerId) throws InvalidDealerException {
        return new ResponseEntity<Dealer>(dealerService.viewDealerById(dealerId),HttpStatus.OK);
    }
    
	@GetMapping("/viewDealersByLocationAndBrand/{location}/{authorizedBrand}")
    public ResponseEntity<List<Dealer>> viewDealersByLocationAndBrand(@PathVariable String location,@PathVariable  String authorizedBrand) {
        return new ResponseEntity<List<Dealer>>(dealerService.viewDealersByLocationAndBrand(location, authorizedBrand), HttpStatus.OK);
    }
    
	@GetMapping("/getAvailableLaptopCountDealerWise")
    public ResponseEntity<Map<String, Integer>> getAvailableLaptopCountDealerWise() {
        return null;
    }
}
