package com.xworkz.constructorwithThis;

public class Person {

	
	int age;
	String name;
	
	
	public Person(int age ,String name)
	{
		this.age=age ;
		this.name=name;
		
		System.out.println("age : " +age+ " " + "name : "+name );
	}
	
	public static void main(String[] args) {
		
	Person p1 =new Person(20, "Sharath");
	
	
	
	}
}
