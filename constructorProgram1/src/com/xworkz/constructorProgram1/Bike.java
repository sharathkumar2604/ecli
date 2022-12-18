package com.xworkz.constructorProgram1;

public class Bike {
 int estimate;
 
	Bike(int cost)
	{
		estimate=cost;
		
		//System.out.println("cost:"+estimate);
	}
	
	public static void main(String[] args) {
		
		Bike b = new Bike(29);
		Bike b1= new Bike(22);
		
		System.out.println(b.estimate);
		System.out.println(b1.estimate);
	}
	
}
