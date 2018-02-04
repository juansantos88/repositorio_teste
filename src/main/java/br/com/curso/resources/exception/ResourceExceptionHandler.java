package br.com.curso.resources.exception;

import javax.servlet.http.HttpServletRequest;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import br.com.curso.repositories.services.exceptions.ErrorInternalException;
import br.com.curso.repositories.services.exceptions.ObjectNotFoundException;


@ControllerAdvice
public class ResourceExceptionHandler {
	
	@ExceptionHandler(ObjectNotFoundException.class)
	public ResponseEntity<StandardError> objectNotFound(ObjectNotFoundException e , HttpServletRequest request){
		StandardError erro = new StandardError(HttpStatus.NOT_FOUND.value(),e.getMessage(),System.currentTimeMillis());
		return ResponseEntity.status(HttpStatus.NOT_FOUND).body(erro);
		
	}
	
	
	@ExceptionHandler(ErrorInternalException.class)
	public ResponseEntity<StandardError> errorInternal(ErrorInternalException e , HttpServletRequest request){
		StandardError erro = new StandardError(HttpStatus.INTERNAL_SERVER_ERROR.value(),e.getMessage(),System.currentTimeMillis());
		return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(erro);
		
	}
	

}
