package com.xworkz.methodcreation;
//method creation with arguments and without return type

public class MethodCreation2 {

	void display(String firstname, String lastname) {
		System.out.println(firstname + lastname);

	}

	public static void main(String[] args) {

		MethodCreation2 mwawrt = new MethodCreation2();
		mwawrt.display("Sharath", "kumar");
	}
}
