package com.xworkz.aptitude_Question;

import java.util.Scanner;

public class AddingNumber {

	public static void main(String[] args) {
		
		
		Scanner myobj =new Scanner(System.in);
	 System.out.println("enter the number");
		int n= myobj.nextInt();
		int sum=0;
		
		for(int i=1;i<=n;i++)
		{
			System.out.print(i+"+");
		 sum=sum+i;
		}
		System.out.println("sum="+sum);
	}
}
