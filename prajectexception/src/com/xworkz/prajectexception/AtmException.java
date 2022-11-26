package com.xworkz.prajectexception;

public class AtmException extends Exception {
  
	@Override
	public String toString() {
	 return "invalid amount ";
	 
	}
	@Override
	public String getMessage() {
		return "crossing limit";
	}
}