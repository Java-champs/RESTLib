package com.restful.api.exception;

import java.util.Map;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class RestApiExcepitonHandler {

	
	@ResponseStatus(code=HttpStatus.NOT_FOUND, reason="Record Not Found")
	@ExceptionHandler(value = NotFoundExcepiton.class)
	public Map notFoundException(){
		
		return null;
		
	}
}
