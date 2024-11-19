package com.service;

import java.time.LocalDate;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.entities.Loan;
import com.entities.Payment;
import com.exception.InvalidPaymentException;
import com.exception.InvalidLoanException;
import com.repository.PaymentRepository;
import com.repository.LoanRepository;

@Service
public class PaymentServiceImpl implements IPaymentService {

    // Provide necessary Annotation
	@Autowired
    private PaymentRepository paymentRepository;

    // Provide necessary Annotation
	@Autowired
    private LoanRepository loanRepository;
  
    public Payment addPayment(Payment payment, String loanId) throws InvalidLoanException {
       
		// Fill the code
    	Loan loan=loanRepository.findById(loanId).orElseThrow(()->new InvalidLoanException());
    	payment.setLoanObj(loan);
		return paymentRepository.save(payment);
    }

   
    public Payment updatePaymentMode(String paymentId, String paymentMode) throws InvalidPaymentException {
       
		// Fill the code
    	Payment payment=paymentRepository.findById(paymentId).orElseThrow(()->new InvalidPaymentException());
    	payment.setPaymentMode(paymentMode);
		return paymentRepository.save(payment);
    }

   
    public List<Payment> viewPaymentsByDateAndMode(LocalDate paymentDate, String paymentMode) {
        
		// Fill the code
		return paymentRepository.findByPaymentDateAndPaymentMode(paymentDate, paymentMode);
    }

    
    public List<Payment> viewPaymentsByLoanId(String loanId) {
        
		// Fill the code
    	
		return paymentRepository.viewPaymentsByLoanId(loanId);
    }

    
    public Payment cancelPayment(String paymentId) throws InvalidPaymentException {
       
		// Fill the code
    	Payment payment=paymentRepository.findById(paymentId).orElseThrow(()->new InvalidPaymentException());
    	paymentRepository.deleteById(paymentId);
		return payment;
    }
}
