package com.entities;

import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.PastOrPresent;
import jakarta.validation.constraints.Positive;
import lombok.AllArgsConstructor;
import lombok.Data;

//Provide necessary Annotation wherever necessary
// Use appropriate lombok annotations for auto-generating constructor/getter/setter 
// OR manually define the constructor/getter/setter methods, but not both.
@Entity
@Data
@AllArgsConstructor
public class Payment {

    // Provide necessary Annotation
	@Id
	@NotEmpty(message = "Provide value for payment id")
	@Column(length = 25)
    private String paymentId;
	@Positive(message = "Emi amount should be positive and nonzero")
	private double emiAmount;
	@PastOrPresent(message = "Payment date should be current or past date")
	private LocalDate paymentDate;
	@NotEmpty(message = "Provide value for payment mode")
	@Column(length = 25)
	private String paymentMode;
	// Provide necessary Annotation
	@ManyToOne
	@JoinColumn(name = "loan_id")
	private Loan loanObj;

	public Payment()
	{
	    super();
	}
}
