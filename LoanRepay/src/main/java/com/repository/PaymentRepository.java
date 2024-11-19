package com.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.entities.Payment;

//Provide necessary annotation
@Repository
public interface PaymentRepository extends JpaRepository<Payment, String>  {

	// Provide necessary methods to view payments by paymentDate and paymentMode and to view payments by loan id

   
}
