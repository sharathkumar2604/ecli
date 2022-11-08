package com.xworkz.conditional_statement;

public class MarksValidation {
public static void main(String[] args)
{

	int marks= 85; 
	
	if(marks>=101)
	{
		System.out.println("Invalid marks");
	}
	else if (marks<34)
	{
		System.out.println("Fail");
	}
	else if (marks>=35 && marks<=45)
	{
		System.out.println("Pass");
		
	}
	else if (marks>=46 && marks<=60)
	{
		System.out.println("Second class");
	}
	else if (marks>=60 && marks<=75)
	{
		System.out.println("First class");
	}
	else
	{
		System.out.println("Distinction");
	}
}
}