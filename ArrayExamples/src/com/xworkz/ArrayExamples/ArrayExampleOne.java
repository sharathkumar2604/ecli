package com.xworkz.ArrayExamples;

import java.util.Scanner;

public class ArrayExampleOne {

	public static void main(String[] args) {
		int[] b = {10,20,30,40};
//		Scanner scan = new Scanner(System.in);
//		System.out.println("enter the array size");
//		int a = scan.nextInt();
//		

//		while(a<=b.length)
//	{
//	System.out.println("i am entered into while loop");
		int sum=0;
		for(int i=0;i<b.length;i++)
			{
			sum=sum+b[i];
			}
		System.out.println(sum);
			System.out.println("i quit loop");
			
			System.out.println("==============");
			
			
			int[] d = {10,20,30,40};
			
			for(int i=d.length-1;i>0;i--)
			{
				System.out.println(d[i]);
			}
			
			System.out.println();
			System.out.println("===============");
			
			int [] c = {10,20,30,40,50};
			
			int sum1 =0;
			for(int i=0;i<c.length;i++)
			{
				//System.out.println("me");
				sum1=sum1+c[i];
			}
			System.out.println(sum1);
			
	}
}
