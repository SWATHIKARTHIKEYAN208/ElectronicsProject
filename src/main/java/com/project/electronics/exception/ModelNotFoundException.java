package com.project.electronics.exception;

import org.springframework.expression.AccessException;

public class ModelNotFoundException extends Exception {
	public ModelNotFoundException(String e) {
		super(e);
	}

}
