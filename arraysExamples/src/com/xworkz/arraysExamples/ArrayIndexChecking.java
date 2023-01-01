package com.xworkz.arraysExamples;

import java.util.Scanner;

public class ArrayIndexChecking {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("enter the array size");
		int size = scan.nextInt();
		
		
		System.out.println("enter the values for the "+size);
		
		int[] a = new int[size];
		for(int i=0;i<a.length;i++)
		{
			a[i]=scan.nextInt();
			
		}
		System.out.println("array elemets are");
		
		for (int i=0;i<a.length;i++)
		{
			
			System.out.println(a[i]+"index number are"+i);
		}
		
		
	}
}
