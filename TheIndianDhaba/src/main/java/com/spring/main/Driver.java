package com.spring.main;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.spring.config.ApplicationConfig;
import com.spring.model.Dish;
import com.spring.service.DishService;

public class Driver {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
//		ApplicationContext c = new AnnotationConfigApplicationContext(ApplicationConfig.class);
//		DishService DS = c.getBean(DishService.class);
//		Dish d = c.getBean(Dish.class);
//		List<String> a= new ArrayList<String>();
		
		// Fill the code
		
//		try (Exception e){
		
		System.out.println("First dish details");
		System.out.println("Enter the dish name");
		String dishName=sc.nextLine();
		System.out.println("Enter the number of orders taken for the dish");
		int num =sc.nextInt();
		System.out.println("Second dish details");
		System.out.println("Enter the dish name");
		String dishName2=sc.nextLine();
		System.out.println("Enter the number of orders taken for the dish");
		int num2 =sc.nextInt();
		
//		}
//		catch{
//			System.out.println(e.getMessage);
//		}
		
		System.out.println("The bonus amount from the"+ dishName+" dish is ");
		System.out.println("The bonus amount from the"+ dishName2+" dish is ");
		
	}

}
