package com.xworkz.aptitude_Question;

public class PositiveOrNegative_Number {

	public static void main(String[] args) {
		int number=10;
		System.out.println("****CHECKING GIVEN NUMBER IS POSITIVE NUMBER OR NEGATIVE NUMBER****");
		
		System.out.println();
		if(number >=0)
		{
			System.out.println( "           " +number+">>>>>>>is positive number");
			
		}
		else if(number<0)
		{
			System.out.println( "           " +number+">>>>>>>is negative number");
			
		}
		else 
		{
			System.out.println( "           " +"enter valid number not special characters");
		}
		
	}
}
