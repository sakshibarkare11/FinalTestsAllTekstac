package com.spring.model;

import java.util.Map;
//pojo class with required attributes,getters and setters 
//use appropriate annotation to make this class as component class

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

//Use appropriate annotation for scope
@Component
@Scope("prototype")
public class Dish implements Restaurant {

	private String name;
	private int orderCount;
	private double bonusAmount;

	// use appropriate annotation
	@Value("#{${dishDetails.map}}")
	private Map<String, Double> dishDetails;

	// use appropriate annotation
	@Value("#{${percentage}}")
	private double percentage;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getOrderCount() {
		return orderCount;
	}

	public void setOrderCount(int orderCount) {
		this.orderCount = orderCount;
	}

	public double getBonusAmount() {
		return bonusAmount;
	}

	public void setBonusAmount(double bonusAmount) {
		this.bonusAmount = bonusAmount;
	}

	public Map<String, Double> getDishDetails() {
		return dishDetails;
	}

	public void setDishDetails(Map<String, Double> dishDetails) {
		this.dishDetails = dishDetails;
	}

	public double getPercentage() {
		return percentage;
	}

	public void setPercentage(double percentage) {
		this.percentage = percentage;
	}

	@Override
	public void calculateBonusAmount(double dishSalesAmount) {

		// Fill the code

	}
}
