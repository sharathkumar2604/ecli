package com.xworkz.custom_dmart_exception;

import java.util.Scanner;

public class DmartCustomer {
 
	public static void main(String[] args) {
		Dmart dmart = new Dmart();
		try {
		dmart.search(new DmartProduct("book",33.99,"500grams"));
		
		
	}
		catch(DmartException e)
		{
			System.out.println(e);
		}
	}
}
