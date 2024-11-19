package com.entities;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Positive;
import lombok.AllArgsConstructor;
import lombok.Data;

//Provide necessary Annotation wherever necessary
// Use appropriate lombok annotations for auto-generating constructor/getter/setter 
// OR manually define the constructor/getter/setter methods, but not both.
@Entity
@Data
@AllArgsConstructor
public class Loan {

   	// Provide necessary Annotation
	@Id
	@NotEmpty(message = "Provide value for loan id")
	@Column(length = 25)
   	private String loanId;
	@Positive(message = "Loan amount should be positive and nonzero")
	private double loanAmount;
	@Positive(message = "Rate of interest should be positive and nonzero")
	private float rateOfInterest;
	@NotEmpty(message = "Provide value for loan type")
	@Column(length = 25)
    private String loanType;
	@Positive(message = "Tenure should be positive and nonzero")
	private int tenure;
	@NotEmpty(message = "Provide value for borrower name")
	@Column(length = 25)
	private String borrowerName;
	@NotEmpty(message = "Provide value for loan status")
	@Column(length = 25)
	private String loanStatus;

	// Provide necessary Annotation
	@OneToMany(mappedBy = "loanObj",cascade = CascadeType.ALL)
    private List<Payment> paymentList;

	public Loan()
	{
	   super();
	}
}
