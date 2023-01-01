package com.xworkz.aptitude_Question;

import java.util.Scanner;

public class ArrayOccuranceExample {
public static void main(String[] args) {
	
	
	Scanner scan = new Scanner(System.in);
	System.out.println("enter the size of an array");
	int size = scan.nextInt();
	
	System.out.println("enter"+size+"values");
	
	int [] a = new int[size];
	
	
	for(int i=0;i<a.length;i++)
	{
		
		a[i]=scan.nextInt();
		
	}
	
	System.out.println("enter the element for no of occurance");
	
	int count=0;
	int element= scan.nextInt();
	
	for(int i=0;i<a.length;i++) {
		
		if(a[i]==element)
		{
			count++;
		}
		
	}
	
	
     System.out.println("no of occurance"+element+"is"+count);	
	
}
}
