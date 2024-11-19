package com.spring.bo;

import java.util.Map;

import org.springframework.stereotype.Component;

import com.spring.model.Dish;

//use appropriate annotation to make this class as component class
@Component
public class DishBO {

	public double calculateDishSalesAmount(Dish dishObj) {
		double dishSalesAmount = 0;
//		double totalSaleCost=0;
//		double costperorder =0;
		double ordercount= dishObj.getOrderCount();
		double dishv=dishObj.getDishDetails().get(dishObj.getName());
		dishSalesAmount =dishv*ordercount;
		// Fill the code
		
//		for (Map.Entry<String,Double> p : dishObj.getDishDetails().entrySet()) {
//			dishSalesAmount=costperorder *ordercount;
//			dishSalesAmount= p.getValue() * dishObj.getOrderCount();
//	
//		}
		
//		dishSalesAmount=costperorder *ordercount;
		return dishSalesAmount;
		
	}
}
