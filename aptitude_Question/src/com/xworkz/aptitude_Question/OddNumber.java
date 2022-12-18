package com.xworkz.aptitude_Question;
import java.util.Scanner;
public class OddNumber {
public static void main(String[] args) {
	
	//int n=10;
	
	System.out.println("enter the values");
	System.out.println();
	Scanner rv= new Scanner(System.in);
	int n=rv.nextInt();
	for(int i=1;i<=n;i++)
		
	{
		if(i%2==1)
		{
			System.out.print(i+ "");
		}
		else 
		{
			System.out.println();
		}
	}
	
	
}
}
