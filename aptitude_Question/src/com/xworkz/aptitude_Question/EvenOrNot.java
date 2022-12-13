package com.xworkz.aptitude_Question;

import java.util.Scanner;

public class EvenOrNot {
public static void main(String[] args) {

	
	Scanner myobj = new Scanner(System.in);
	while(true) {
	System.out.print("enter number check wheather is even or odd");
	    
     
	int x=myobj.nextInt();
	System.out.println();	
	
	if(x%2==0)
	{
		System.out.println(x+"is even number");
		
	}
	
	else if(x%2!=0)
	{
		System.out.println(x+"is odd number");
		
	}
	else
	{
		System.out.println("invalid");
	}
	}
	
}
}
