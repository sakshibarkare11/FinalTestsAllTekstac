package com.controller;

import java.time.LocalDate;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.entities.Payment;
import com.exception.InvalidPaymentException;
import com.exception.InvalidLoanException;
import com.service.IPaymentService;

import jakarta.validation.Valid;
import lombok.val;

//Provide necessary Annotation
@RestController
public class PaymentController {
    
    //Provide necessary Annotation
	@Autowired
    private IPaymentService paymentService;
    
    // Provide necessary Annotation and fill code in the below methods


	@PostMapping("/addPayment/{loanId}")
    public ResponseEntity<Payment> addPayment(@Valid @RequestBody Payment payment,@Valid @PathVariable String loanId) throws InvalidLoanException {
       	
	    // fill code
		Payment p=paymentService.addPayment(payment, loanId);
	    return new ResponseEntity<Payment>(p,HttpStatus.OK);
    }

   
	@PutMapping("/updatePaymentMode/{paymentId}/{paymentMode}")
    public ResponseEntity<Payment> updatePaymentMode(@Valid @PathVariable String paymentId,@Valid @PathVariable String paymentMode) throws InvalidPaymentException {
 	
	    // fill code
		Payment p=paymentService.updatePaymentMode(paymentId, paymentMode);
	    return new ResponseEntity<Payment>(p,HttpStatus.OK);
    }

	@GetMapping("/viewPaymentsByDateAndMode/{paymentDate}/{paymentMode}")
    public ResponseEntity<List<Payment>> viewPaymentsByDateAndMode(@Valid @PathVariable LocalDate paymentDate,@Valid @PathVariable String paymentMode) {
        	
	    // fill code
		List<Payment> list=paymentService.viewPaymentsByDateAndMode(paymentDate, paymentMode);
	    return new ResponseEntity<List<Payment>>(list,HttpStatus.OK);
    }

   @GetMapping("/viewPaymentsByLoanId/{loanId}")
    public ResponseEntity<List<Payment>> viewPaymentsByLoanId(@Valid @PathVariable String loanId) {
        	
	    // fill code
	   List<Payment> list=paymentService.viewPaymentsByLoanId(loanId);
	    return new ResponseEntity<List<Payment>>(list,HttpStatus.OK);
    }

   @DeleteMapping("/cancelPayment/{paymentId}")
    public ResponseEntity<Payment> cancelPayment(@Valid @PathVariable String paymentId) throws InvalidPaymentException {
       	
	    // fill code
	   Payment p=paymentService.cancelPayment(paymentId);
	    return new ResponseEntity<Payment>(p,HttpStatus.OK);
    }
}
