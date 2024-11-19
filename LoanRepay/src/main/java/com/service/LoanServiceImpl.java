package com.service;
import java.util.List;
import java.util.Map;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.entities.Loan;
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
    	Loan loan = loanRepository.findById(loanId).orElseThrow(()-> new InvalidLoanException());
    	loan.setRateOfInterest(rateOfInterest);
	    return loanRepository.save(loan);
//	    return null;
    }

   
    public Loan viewLoanById(String loanId) throws InvalidLoanException {
	    // fill code
    	return loanRepository.findById(loanId).orElseThrow(()-> new InvalidLoanException());
//    	return null;
    }

    public List<Loan> viewLoansByType(String loanType) { 	
	    // fill code
	    return loanRepository.findLoanByType(loanType);
//    	return null;
    }

    public Map<String, Double> getLoanIdWiseTotalEmiAmountPaid() {   	
	    // fill code
	    return null;
    }

}
