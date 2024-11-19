package com.repository;

import java.util.List;
import java.util.Map;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.entities.Loan;

//Provide necessary annotation
@Repository
public interface LoanRepository extends JpaRepository<Loan, String> {


	// Provide necessary methods to view  loans by loanType and to get the total emiAmount paid loanwise
	List<Loan> findByLoanType(String type);
	
	

   
}
