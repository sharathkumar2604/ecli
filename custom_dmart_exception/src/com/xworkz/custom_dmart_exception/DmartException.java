package com.xworkz.custom_dmart_exception;

public class DmartException extends RuntimeException {
  
	@Override
	public String toString() {
		return "out of stock";
	}
}
