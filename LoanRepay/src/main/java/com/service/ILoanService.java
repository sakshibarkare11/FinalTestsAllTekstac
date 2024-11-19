
package com.service;

import java.util.List;
import java.util.Map;

import com.entities.Loan;
import com.exception.InvalidLoanException;

public interface ILoanService {
	public Loan addLoan(Loan loan);
	public Loan updateRateOfInterest(String loanId, float rateOfInterest) throws InvalidLoanException;
	public Loan viewLoanById(String loanId) throws InvalidLoanException;
	public List<Loan> viewLoansByType(String loanType);
	public Map<String, Double> getLoanIdWiseTotalEmiAmountPaid();
}
