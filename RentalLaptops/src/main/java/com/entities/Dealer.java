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
	@NotEmpty(message="Provide value for dealer Id")
	@Column(length=25)
    private String dealerId;
	@NotEmpty(message="Provide value for dealername")
	@Column(length=25)
    private String dealerName;
	@NotEmpty(message="Provide value for location")
	@Column(length = 25)
    private String location;
	@NotEmpty(message="Provide value for email")
	@Column(length = 25)
    private String email;
	@Range(min=1,max=10,message="Rating should be in between1 and 10")
	@Column(length = 11)
    private int rating;
	@NotEmpty(message="Provide value forauthorized brand")
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



//You have clicked on "Save and Evaluate". The results are shown below. 
//
//
//
//Failed Test Cases : Spring 
//
//
//Fail 1 -- test6PredefinedValidationInRestAPIAddLaptop::
//
//
//
//Predefined Validation for /addLaptop rest api call for brand is not correct
//
//
//
//
//Failed Test Cases : Functional 
//
//
//Fail 1 -- test11GetAvailableLaptopCountDealerWise::
//
//
//
//Check the logic of getAvailableLaptopCountDealerWise method in the DealerServiceImpl class
//
//
//
//
//Grading and Feedback 
//
//
//
//JPA Annotations - 13.00 / 13.00(Success) 
//
//
//
//* check whether the Entity annotation present above the Entity classes - 1.00 / 1.00 
//
//
//
//* check whether the Id annotation above dealerId attribute in Dealer class - 1.00 / 1.00 
//
//
//
//* check whether the Id annotation above laptopId attribute in Laptop class - 1.00 / 1.00 
//
//
//
//* check whether the mapping is done with proper annotation in the Laptop class - 3.00 / 3.00 
//
//
//
//* check whether the mapping is done with proper annotation in the Dealer class - 3.00 / 3.00 
//
//
//
//* check whether the JoinColumn annotation is used with correct attributes in the Laptop class - 1.00 / 1.00 
//
//
//
//* check whether the Column annotation is used with required length for all String fields in the Dealer class - 1.50 / 1.50 
//
//
//
//* check whether the Column annotation is used with required length for all String fields in the Laptop class - 1.50 / 1.50 
//
//
//
//Dependency Injection - 2.00 / 2.00(Success) 
//
//
//
//* check whether the dealerService is autowired inside the DealerController class - 1.00 / 1.00 
//
//
//
//* check whether the laptopService is autowired inside the LaptopController class - 1.00 / 1.00 
//
//
//
//End points and HTTP Methods for REST Service - 27.00 / 27.00(Success) 
//
//
//
//* Check the Rest Service call for addDealer works as expected - 2.00 / 2.00 
//
//
//
//* Check the Rest Service call for viewDealerById works as expected - 3.00 / 3.00 
//
//
//
//* Check the Rest Service call for viewDealersByLocationAndBrand works as expected - 3.00 / 3.00 
//
//
//
//* Check the Rest Service call for updateRating works as expected - 3.00 / 3.00 
//
//
//
//* Check the Rest Service call for getAvailableLaptopCountDealerWise works as expected - 2.00 / 2.00 
//
//
//
//* Check the Rest Service call for addLaptop works as expected - 2.00 / 2.00 
//
//
//
//* Check the Rest Service call for updateAvailabilityStatus works as expected - 3.00 / 3.00 
//
//
//
//* Check the Rest Service call for viewLaptopsWithRam works as expected - 3.00 / 3.00 
//
//
//
//* Check the Rest Service call for viewLaptopsByDealerId works as expected - 3.00 / 3.00 
//
//
//
//* Check the Rest Service call for scrapALap works as expected - 3.00 / 3.00 
//
//
//
//Spring Validations - 6.00 / 8.00(Success) 
//
//
//
//* Check whether the rest service throws predefined validation message when basic validation fails in the Dealer class - 2.00 / 2.00 
//
//
//
//* Check whether the rest service throws predefined validation message when validation for rating fails in the Dealer class - 2.00 / 2.00 
//
//
//
//* Check whether the rest service throws predefined validation message when basic validation fails in the Laptop class - 0.00 / 2.00 
//
//
//
//* Check whether the rest service throws predefined validation message when validation for ram storage and rentalPrice fails in the Laptop class - 2.00 / 2.00 
//
//
//
//CRUD Operations using JPA - 18.00 / 18.00(Success) 
//
//
//
//* Check the logic of addDealer method in the DealerServiceImpl class - 3.00 / 3.00 
//
//
//
//* Check the logic of addLaptop method in the LaptopServiceImpl class - 4.00 / 4.00 
//
//
//
//* Check the logic of updateRating method in the DealerServiceImpl class - 4.00 / 4.00 
//
//
//
//* Check the logic of updateAvailabilityStatus method in the LaptopServiceImpl class - 4.00 / 4.00 
//
//
//
//* Check the logic of scrapALap method in the LaptopServiceImpl class - 3.00 / 3.00 
//
//
//
//Usage of JPA Query methods - 16.00 / 22.00(Success) 
//
//
//
//* Check the logic of viewDealerById method in the DealerServiceImpl class - 3.00 / 3.00 
//
//
//
//* Check the logic of getAvailableLaptopCountDealerWise method in the DealerServiceImpl class - 0.00 / 6.00 
//
//
//
//* Check the logic of viewDealersByLocationAndBrand method in the DealerServiceImpl class - 4.00 / 4.00 
//
//
//
//* Check the logic of viewLaptopsByDealerId method in the LaptopServiceImpl class - 4.00 / 4.00 
//
//
//
//* Check the logic of viewLaptopsWithRam method in the LaptopServiceImpl class - 5.00 / 5.00 
//
//
//
//Exception Handling - 8.00 / 8.00(Success) 
//
//
//
//* Check the logic of addLaptop functionality in the LaptopServiceImpl class when dealerId is invalid - 2.00 / 2.00 
//
//
//
//* Check the logic of updateRating method in the DealerServiceImpl class when dealerId is invalid - 1.50 / 1.50 
//
//
//
//* Check the logic of updateAvailabilityStatus method in the LaptopServiceImpl class when laptopId is invalid - 1.50 / 1.50 
//
//
//
//* Check the logic of scrapALap method in the LaptopServiceImpl class when laptopId is invalid - 1.50 / 1.50 
//
//
//
//* Check the logic of viewDealerById in the DealerServiceImpl class for dealerId that does not exist - 1.50 / 1.50 
//
//
//
//Lombok - 2.00 / 2.00(Success) 
//
//
//
//* Check whether lombok annotation is used in the model class to generate getters and setters in Dealer class - 0.50 / 0.50 
//
//
//
//* Check whether lombok annotation is used in the model class to generate constructors in Dealer class - 0.50 / 0.50 
//
//
//
//* Check whether lombok annotation is used in the model class to generate getters and setters in Laptop class - 0.50 / 0.50 
//
//
//
//* Check whether lombok annotation is used in the model class to generate constructors in Laptop class - 0.50 / 0.50 
//
