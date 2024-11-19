package com.entities;

import java.util.List;

import org.hibernate.validator.constraints.Range;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.validation.constraints.NotEmpty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;


//Provide necessary Annotation wherever necessary
@Entity
@Getter
@Setter
@AllArgsConstructor
public class Dealer {

    // Provide necessary Annotation
	@Id
	@NotEmpty(message ="Provide value for dealer Id")
	@Column(length = 25)
    private String dealerId;
	
	@NotEmpty(message ="Provide value for dealer name")
	@Column(length = 25)
    private String dealerName;
	
	@NotEmpty(message="Provide value for location")
	@Column(length = 25)
    private String location;
	
	@NotEmpty(message="Provide value for email")
	@Column(length = 25)
    private String email;
	
	@Range(min=1, max=10 , message="Rating should be in between1 and 10")
    private int rating;
	
	@NotEmpty(message="Provide value for authorized brand")
	@Column(length = 25)
    private String authorizedBrand;
	
	@NotEmpty(message="Provide value for servicetype")
	@Column(length = 25)
    private String serviceType;

    // Provide necessary Annotation
    @OneToMany(mappedBy = "dealerObj")
    private List<Laptop> laptopList;

	public Dealer()
	{
	   super();
	}
}
