package com.exception;


import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

public class CustomizedResponseEntityExceptionHandler extends ResponseEntityExceptionHandler {
	@ExceptionHandler(Exception.class)
	public final ResponseEntity<Object> handleAllExceptions(Exception ex, WebRequest request) {
		
		// Fill the code here
		
		return new ResponseEntity<Object>(ex,HttpStatus.INTERNAL_SERVER_ERROR);
	}
	@ExceptionHandler({InvalidDealerException.class, InvalidLaptopException.class})
	public final ResponseEntity<ExceptionResponse> handleNotFoundException(RuntimeException ex, WebRequest request) {
		
		// Fill the code here
		
		ExceptionResponse expp=  new ExceptionResponse(LocalDate.now(), ex.getMessage(), ex.getLocalizedMessage(), "500");
		return new ResponseEntity<ExceptionResponse>(expp, HttpStatus.NOT_FOUND);
		
	}

	@Override
	protected ResponseEntity<Object> handleMethodArgumentNotValid(MethodArgumentNotValidException ex,
		HttpHeaders headers, HttpStatusCode status, WebRequest request) {	
		    
		    // Fill the code here
		Map<String, String> m = new HashMap<String, String>();
		for (FieldError err : ex.getBindingResult().getFieldErrors()) {
			m.put(err.getField(), err.getDefaultMessage());
		}
		return new ResponseEntity<Object>(m,HttpStatus.BAD_REQUEST);
	}
}