package com.entities;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Positive;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

//Provide necessary Annotation wherever necessary
// Use appropriate lombok annotations for auto-generating constructor/getter/setter 
// OR manually define the constructor/getter/setter methods, but not both.
@Entity
@Getter
@Setter
@AllArgsConstructor
public class Loan {

   	// Provide necessary Annotation
	@Id
	
	@NotEmpty(message= "Provide value for loan id")
   	private String loanId;
	@Positive(message= "Loan amount should be positive and nonzero")
	private double loanAmount;
	
	@Positive(message= "Rate of interest should be positive and nonzero")
	private float rateOfInterest;
	@NotEmpty(message="Provide value for loan type")
	
    private String loanType;
	@Positive(message="Tenure should be positive and nonzero")
	
	private int tenure;
	@NotEmpty(message="Provide value for borrower name")
	
	private String borrowerName;
	@NotEmpty(message="Provide value for loan status")
	private String loanStatus;

	// Provide necessary Annotation
	@OneToMany(mappedBy = "loanObj")
    private List<Payment> paymentList;

	public Loan()
	{
	   super();
	}
}
