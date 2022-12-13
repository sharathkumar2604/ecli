package com.xworkz.aptitude_Question;

import java.util.Scanner;

public class Materi {
public static void main(String[] args) {
	
System.out.println("MATRIMONEY");
	Scanner myobj = new Scanner(System.in);
	System.out.println("gender");
	String gender=myobj.next();
	System.out.println("age");
      int  age =myobj.nextInt();
	
	if(gender=="male")
	{ 
		System.out.println("enter age");
		if(age>=21)
		{
			System.out.println(age+ "you can marry");
			
		}
		else
		{
			System.out.println("you can't eligible at" +age);
		}
		

	{
		if(gender=="female")
		{
			System.out.println("enter age ");
              if (age>=18)
              {
            	  System.out.println("you can marry ");
              }
              else
              {
            	  System.out.println("you can't eligible at"+age);
              }
              
		}
	}

	
	
	

	}
}
}
