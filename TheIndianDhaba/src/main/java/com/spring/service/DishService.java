package com.spring.service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.spring.bo.DishBO;
import com.spring.exception.UnavailableDishException;
import com.spring.model.Dish;

//use appropriate annotation to make this class as component class
@Component
public class DishService {

	private DishBO dishBO;

	// use appropriate annotation
	@Autowired
	public DishService(DishBO dishBO) {
		super();
		this.dishBO = dishBO;
	}

	public DishBO getDishBO() {
		return dishBO;
	}

	public void setDishBO(DishBO dishBO) {
		this.dishBO = dishBO;
	}

	public void calculateDishSalesAmount(Dish dishObj) throws UnavailableDishException {
		// Fill the code
		if(dishObj.getName().isEmpty()) {
			throw new UnavailableDishException("This dish is not available");
		}
	}
}