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

//Provide necessary Annotation
@RestController
public class LoanController {

    //Provide necessary Annotation
	@Autowired
    private ILoanService loanService;

    // Provide necessary Annotation and fill code in the below methods
    
   @PostMapping("/addLoan")
    public ResponseEntity<Loan> addLoan(@RequestBody Loan loan) {
	    // fill code
	    return new ResponseEntity<Loan>(loanService.addLoan(loan), HttpStatus.OK);
    }
    
   	@PutMapping("/updateRateOfInterest/{loanId}/{rateOfInterest}")
    public ResponseEntity<Loan> updateRateOfInterest(@PathVariable String loanId,@PathVariable float rateOfInterest) throws InvalidLoanException {
       	
	    // fill code
//	    return new ResponseEntity<Loan>(loanService.updateRateOfInterest(loanId, rateOfInterest), HttpStatus.OK);
	    return null;
	    //return null;
    }
    
   	@GetMapping("/viewLoanById/{loanId}")
    public ResponseEntity<Loan> viewLoanById(@PathVariable String loanId) throws InvalidLoanException {
       	
	    // fill code
//	    return new ResponseEntity<Loan>(loanService.viewLoanById(loanId),HttpStatus.OK);
   		return null;
    }
    
   	@GetMapping("/viewLoansByType/{loanType}")
    public ResponseEntity<List<Loan>> viewLoansByType(@PathVariable String loanType) {
        	
	    // fill code
//	    return new ResponseEntity<List<Loan>>(loanService.viewLoansByType(loanType),HttpStatus.OK);
   		return null;
    }
    
   	@GetMapping("/getLoanIdWiseTotalEmiAmountPaid")
    public ResponseEntity<Map<String, Double>> getLoanIdWiseTotalEmiAmountPaid() {
       	
	    // fill code
//	    return new ResponseEntity<Map<String,Double>>(loanService.getLoanIdWiseTotalEmiAmountPaid(),HttpStatus.OK);
	    return null;
    }
}
