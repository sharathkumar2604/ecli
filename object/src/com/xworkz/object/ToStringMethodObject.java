package com.xworkz.object;

public class ToStringMethodObject {
	
	private String name="Raj";

	public static void main(String[] args) {
		// String[] s= {"m"};

		ToStringMethodObject a = new ToStringMethodObject();//ToStringMethodObject() is class name
		String string = a.toString();
		System.out.println(string);

	}

	@Override
	public String toString() {
		return "ToStringMethodObject[name:"+name+"]";
	}
	

	
	/*
	 * // public String toString(){
	 * 
	 * 
	 * return "sjsaj" ]
	 */

}
