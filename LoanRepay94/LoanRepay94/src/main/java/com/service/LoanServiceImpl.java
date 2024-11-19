package com.service;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.entities.Loan;
import com.entities.Payment;
import com.exception.InvalidLoanException;
import com.repository.LoanRepository;
 
@Service
public class LoanServiceImpl implements ILoanService {

   // Provide necessary Annotation
	@Autowired
    private LoanRepository loanRepository;

    public Loan addLoan(Loan loan) {
	    // fill code
	    return loanRepository.save(loan);
    }

   
    public Loan updateRateOfInterest(String loanId, float rateOfInterest) throws InvalidLoanException {
	    // fill code
    	Loan loan=loanRepository.findById(loanId).orElseThrow(()->new InvalidLoanException());
    	loan.setRateOfInterest(rateOfInterest);
	    return loanRepository.save(loan);
    }

   
    public Loan viewLoanById(String loanId) throws InvalidLoanException {
       	
	    // fill code
	    return loanRepository.findById(loanId).orElseThrow(()->new InvalidLoanException());
    }

   
    public List<Loan> viewLoansByType(String loanType) {
       	
	    // fill code
	    return loanRepository.findByLoanType(loanType);
    }

   
    
   
    public Map<String, Double> getLoanIdWiseTotalEmiAmountPaid() {
       	
	    // fill code
    	Map<String, Double> loanWiseTotal=new HashMap<>();
    	List<Loan> loans=loanRepository.findAll();
    	
    		
    		for(Loan l:loans)
    		{
    			double total=0;
    			List<Payment> payments=l.getPaymentList();
    			for(Payment p:payments)
    			{
    				total=total+p.getEmiAmount();
    			}
    			
    			loanWiseTotal.put(l.getLoanId(), total);
    		}
    		
    	
	    return loanWiseTotal;
    }

}
