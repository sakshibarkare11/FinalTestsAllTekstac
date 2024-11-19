package com.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Positive;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

//Provide necessary Annotation wherever necessary
@Entity
@Getter
@Setter
@AllArgsConstructor
public class Laptop {

    // Provide necessary Annotation
	@Id
	@NotEmpty(message="Provide value for laptop Id")
	@Column(length = 25)
    private String laptopId;
	@NotEmpty(message="Provide value for laptopmodel")
	@Column(length = 25)
    private String brand;
	@NotEmpty(message="Provide value for laptopmodel")
	@Column(length = 25)
    private String model;
	@NotEmpty(message="Provide value for processor")
	@Column(length = 25)
    private String processor;
	@Positive(message="Ram should be greater than zero")
	@Column(length = 11)
    private int ram;
	@Positive(message="Storage should be greaterthan zero")
	@Column(length = 11)
    private int storage;
	@Positive(message="Rental price should begreater than zero")
    private double rentalPrice;
	@NotEmpty(message="Provide value foravailability status")
	@Column(length = 25)
    private String availabilityStatus;
    // Provide necessary Annotations
	@ManyToOne
	@JoinColumn(name="dealer_id")
    private Dealer dealerObj;

	public Laptop()
	{
	   super();
        }
}
