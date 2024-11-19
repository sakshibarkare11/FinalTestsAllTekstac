package com.controller;

import java.time.LocalDate;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

import com.entities.Payment;
import com.exception.InvalidPaymentException;
import com.exception.InvalidLoanException;
import com.service.IPaymentService;

//Provide necessary Annotation
@RestController
public class PaymentController {
    
    //Provide necessary Annotation
	@Autowired
    private IPaymentService paymentService;
    
    // Provide necessary Annotation and fill code in the below methods


	@PostMapping("/addPayment/{loanId}")
    public ResponseEntity<Payment> addPayment( Payment payment, String loanId) throws InvalidLoanException {
       	
	    // fill code
//	    return new ResponseEntity<Payment>(paymentService.addPayment(payment, loanId), HttpStatus.OK);
		return null;
    }

   
	@PutMapping("/updatePaymentMode/{paymentId}/{paymentMode}")
    public ResponseEntity<Payment> updatePaymentMode( String paymentId, String paymentMode) throws InvalidPaymentException {
 	
	    // fill code
//	    return new ResponseEntity<Payment>(paymentService.updatePaymentMode(paymentId, paymentMode),HttpStatus.OK);
		return null;
    }

	@GetMapping("/viewPaymentsByDateAndMode/{paymentDate}/{paymentMode}")
    public ResponseEntity<List<Payment>> viewPaymentsByDateAndMode( LocalDate paymentDate, String paymentMode) {
        	
	    // fill code
//	    return new ResponseEntity<List<Payment>>(paymentService.viewPaymentsByDateAndMode(paymentDate, paymentMode),HttpStatus.OK);
		return null;
    }

	@GetMapping("/viewPaymentsByLoanId/{loanId}")
    public ResponseEntity<List<Payment>> viewPaymentsByLoanId( String loanId) {
        	
	    // fill code
	    return null;
    }

	@DeleteMapping("/cancelPayment/{paymentId}")
    public ResponseEntity<Payment> cancelPayment( String paymentId) throws InvalidPaymentException {
       	
	    // fill code
//	    return new ResponseEntity<Payment>(paymentService.cancelPayment(paymentId),HttpStatus.OK);
		return null;
    }
}
