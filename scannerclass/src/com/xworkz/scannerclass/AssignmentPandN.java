package com.xworkz.scannerclass;

import java.util.Scanner;

public class AssignmentPandN {
  
	String pon(String n)
	{
		if(true)
		{
			System.out.println("entered name is true  :" +n);
		}
		else 
		{
			System.out.println("entered name is not true ");
			
		}
		return n;
	}	
		
	  public static void main(String[] args)
	  {
		  for(int i=1;i<=5;i++)
		  {
			  
		AssignmentPandN ass= new AssignmentPandN() ;
	System.out.println("enter the name");
        Scanner scan =new Scanner(System.in);
		
       String  a= scan.next();
  
       
        ass.pon(a);
	  
	  }
	}
}

