package br.com.curso.repositories.services.exceptions;

public class ErrorInternalException extends RuntimeException{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public ErrorInternalException(String msg) {
		super(msg);
	}
	
	public ErrorInternalException(String msg,Throwable cause) {
		super(msg,cause);
	}

}
