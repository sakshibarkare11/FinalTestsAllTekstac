package com.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.entities.Laptop;
import com.exception.InvalidDealerException;
import com.exception.InvalidLaptopException;
import com.service.ILaptopService;

import jakarta.validation.Valid;

//Provide necessary Annotation
@RestController
public class LaptopController {

    //Provide necessary Annotation
	@Autowired
    private ILaptopService laptopService;

     // Provide necessary Annotation and fill code in the below methods

	@PostMapping("/addLaptop/{dealerId}")
    public ResponseEntity<Laptop> addLaptop(@Valid @RequestBody Laptop laptop,@Valid @PathVariable String dealerId) throws InvalidDealerException {
        return new ResponseEntity<Laptop>(laptopService.addLaptop(laptop, dealerId),HttpStatus.OK);
    }

   @PutMapping("/updateAvailabilityStatus/{laptopId}/{availabilityStatus}")
    public ResponseEntity<Laptop> updateAvailabilityStatus(@Valid @PathVariable String laptopId,@Valid @PathVariable String availabilityStatus) throws InvalidLaptopException {
        return new ResponseEntity<Laptop>(laptopService.updateAvailabilityStatus(laptopId, availabilityStatus),HttpStatus.OK);
    }

    @GetMapping("/viewLaptopsWithRam/{ram}")
    public ResponseEntity<List<Laptop>> viewLaptopsWithRam(@Valid @PathVariable int ram) {
        return new ResponseEntity<List<Laptop>>(laptopService.viewLaptopsWithRam(ram),HttpStatus.OK);
    }

   @GetMapping("/viewLaptopsByDealerId/{dealerId}")
    public ResponseEntity<List<Laptop>> viewLaptopsByDealerId(@Valid @PathVariable String dealerId) {
        return new ResponseEntity<List<Laptop>>(laptopService.viewLaptopsByDealerId(dealerId),HttpStatus.OK);
    }

   @DeleteMapping("/scrapALap/{laptopId}")
    public ResponseEntity<Laptop> scrapALap(@Valid @PathVariable String laptopId) throws InvalidLaptopException {
        return new ResponseEntity<Laptop>(laptopService.scrapALap(laptopId),HttpStatus.OK);
    }
}
