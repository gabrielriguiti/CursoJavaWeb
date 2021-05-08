package br.com.SistemaLogin.exception;

import javax.servlet.ServletException;

public class InvalidUserException extends ServletException {

	public InvalidUserException(String msg) {
		
		super(msg);
	}
}