package com.xworkz.collectionsetexample.exception;

public class HospitalException extends Exception {
	
	
	@Override
	public String toString() {
		return "No content found in hospital detail in request";
		
		
	}

	
	@Override
	public String getMessage() {
		return "Hospital not found ";
		
	}
	
}
