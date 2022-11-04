package com.xworkz.encapsulation_example1;

public class Bike_Encapsulation {
	public static void main(String[] args)
	{
		Bike bike = new Bike();
		
	bike.setName("moto");
	bike.setColor("black and red");
	bike.setCost(400000);
	
	System.out.println("Bike name :"+bike.getName());
	System.out.println("Bike color :"+ bike.getColor());
	System.out.println("Bike cost :"+bike.getCost());
	
	}
	}


