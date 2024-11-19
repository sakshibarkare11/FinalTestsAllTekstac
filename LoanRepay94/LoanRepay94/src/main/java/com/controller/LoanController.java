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

import com.entities.Loan;
import com.exception.InvalidLoanException;
import com.service.ILoanService;

import jakarta.validation.Valid;

//Provide necessary Annotation
@RestController
public class LoanController {

    //Provide necessary Annotation
	@Autowired
    private ILoanService loanService;

    // Provide necessary Annotation and fill code in the below methods
    
   @PostMapping("/addLoan")
    public ResponseEntity<Loan> addLoan(@Valid @RequestBody Loan loan) {
        	
	    // fill code
	   Loan l=loanService.addLoan(loan);
	    return new ResponseEntity<>(l,HttpStatus.OK);
    }
    
   @PutMapping("/updateRateOfInterest/{loanId}/{rateOfInterest}")
    public ResponseEntity<Loan> updateRateOfInterest(@Valid @PathVariable String loanId,@Valid @PathVariable float rateOfInterest) throws InvalidLoanException {
       	
	    // fill code
	   Loan l=loanService.updateRateOfInterest(loanId, rateOfInterest);
	    return new ResponseEntity<>(l,HttpStatus.OK);
    }
    
   	@GetMapping("/viewLoanById/{loanId}")
    public ResponseEntity<Loan> viewLoanById(@Valid @PathVariable String loanId) throws InvalidLoanException {
       	
	    // fill code
   		Loan l=loanService.viewLoanById(loanId);
	    return new ResponseEntity<>(l,HttpStatus.OK);
    }
    
   @GetMapping("/viewLoansByType/{loanType}")
    public ResponseEntity<List<Loan>> viewLoansByType(@Valid @PathVariable String loanType) {
        	
	    // fill code
	   List<Loan> list=loanService.viewLoansByType(loanType);
	    return new ResponseEntity<List<Loan>>(list,HttpStatus.OK);
    }
    
   @GetMapping("/getLoanIdWiseTotalEmiAmountPaid")
    public ResponseEntity<Map<String, Double>> getLoanIdWiseTotalEmiAmountPaid() {
       	
	    // fill code
	   Map<String, Double> map=loanService.getLoanIdWiseTotalEmiAmountPaid();
	    return new ResponseEntity<Map<String,Double>>(map,HttpStatus.OK);
    }
}
