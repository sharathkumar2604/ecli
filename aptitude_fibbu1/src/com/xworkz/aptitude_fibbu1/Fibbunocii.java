package com.xworkz.aptitude_fibbu1;

import java.util.Scanner;

public class Fibbunocii 
{
		public static void main(String[] args )  
		{    
			Scanner sc=new Scanner(System.in);
			System.out.println("enter number of terms  " + " " );
			
			int n=sc.nextInt();
			int i=0,j=1,k;
			System.out.println("Fibonacci series is ");
			for(int c=0;c<n;c++)
			{
			if(c<=1)
			k=c;
			else
			{
			k=i+j;
			i=j;
			j=k;
			}
			System.out.println(k);
			}
			}
		}