package com.repository;

import java.time.LocalDate;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.entities.Payment;

//Provide necessary annotation
@Repository
public interface PaymentRepository extends JpaRepository<Payment, String> {

	// Provide necessary methods to view payments by paymentDate and paymentMode and to view payments by loan id
	List<Payment> findByPaymentDateAndPaymentMode(LocalDate paymentDate, String paymentMode);
	
	@Query(value = "select * from Payment p where p.loan_id=:loanId",nativeQuery = true)
	List<Payment> viewPaymentsByLoanId(@Param("loanId") String loanId);

   
}
