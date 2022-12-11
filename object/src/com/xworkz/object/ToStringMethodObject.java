package com.xworkz.object;

public class ToStringMethodObject {
	
	private String name="sharath";

	public static void main(String[] args) {
		

		ToStringMethodObject a = new ToStringMethodObject();//ToStringMethodObject() is class name
		System.out.println(a.toString());
		

	}

	@Override
	public String toString() {
		return "ToStringMethodObject [name=" + name + "]";
	}

	

	
	/*
	 * // public String toString(){
	 * 
	 * 
	 * return "sjsaj" ]
	 */

}
