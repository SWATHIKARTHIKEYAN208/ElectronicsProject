package com.project.electronics.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobalException {
	@ExceptionHandler(PriceException.class)
	public ResponseEntity<Object> handlePrice(PriceException pe) {
		return new ResponseEntity<Object>("Please enter valid price",HttpStatus.BAD_REQUEST);
	}
	
	@ExceptionHandler(ModelNotFoundException.class)
	public ResponseEntity<String> handlePrice(ModelNotFoundException me) {
		return new ResponseEntity<String>("Valid model",HttpStatus.BAD_REQUEST);
	}

	
	@ExceptionHandler(ColorException.class)
	public String handlePrice(ColorException ce) {
		return new String("Available Color");
	}
	
	@ExceptionHandler(YearException.class)
	public String handlePrice(YearException ye) {
		return new String("Year doesn't");
	}
	
	@ExceptionHandler(BrandException.class)
	public String handlePrice(BrandException be) {
		return new String("Brand n't");
	}

}
