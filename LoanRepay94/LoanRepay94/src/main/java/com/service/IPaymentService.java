



package com.service;

import java.time.LocalDate;
import java.util.List;

import com.entities.Payment;
import com.exception.InvalidPaymentException;
import com.exception.InvalidLoanException;

public interface IPaymentService {
	public Payment addPayment(Payment payment, String loanId) throws InvalidLoanException;
	public Payment updatePaymentMode(String paymentId, String paymentMode) throws InvalidPaymentException;
	public List<Payment> viewPaymentsByDateAndMode(LocalDate paymentDate, String paymentMode);
	public List<Payment> viewPaymentsByLoanId(String loanId);
	public Payment cancelPayment(String paymentId) throws InvalidPaymentException;
}
