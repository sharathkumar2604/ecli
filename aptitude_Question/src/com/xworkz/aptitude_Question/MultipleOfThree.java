package com.xworkz.aptitude_Question;

import java.util.Scanner;

public class MultipleOfThree {
public static void main(String[] args) {
	System.out.println("multiple of three number");
	
	Scanner s= new Scanner(System.in);
	System.out.println("enter the value ");
	
	int n= s.nextInt();
	
	
	
	for(int i=3;i<=n;i=i+3)
	
		{
		
		System.out.println(i+"");
	    }
	
		
}
}

