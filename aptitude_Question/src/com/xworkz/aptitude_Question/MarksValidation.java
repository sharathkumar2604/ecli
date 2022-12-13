package com.xworkz.aptitude_Question;

public class MarksValidation {

	public static void main(String[] args) {
		int marks = -11;
		
		System.out.println("***XWORKZ-ODC RESULT VALIDATION***");
		System.out.println();
		
		
		if(marks>=80 && marks<=100)
		{
			System.out.println("     " + marks+">>>>>destinction");
		}
		else if(marks>=35 && marks<=79)
		{
			System.out.println("     " + marks+">>>>>first class");
			
		}
		else if(marks>=0 && marks<=34)
		{
			System.out.println("     " + marks+">>>>>fail study well!!...");
		}
		else 
		{
			System.out.println("     "+"invalid marks");
			
		}
	}
}
