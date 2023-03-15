package com.seed.dao;

public class NoSuchEmployeeException extends RuntimeException {
	
	public NoSuchEmployeeException() {
		super("No such employee");
	}
	
	public NoSuchEmployeeException(String msg) {
		super(msg);
	}

}
