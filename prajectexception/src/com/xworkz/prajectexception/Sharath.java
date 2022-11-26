package com.xworkz.prajectexception;

import java.util.Scanner;

public class Sharath {
	public static void main(String[] args)
	{
		
		System.out.println("enter amount");
		Scanner scanner = new Scanner(System.in);
		
		
		int amount = scanner.nextInt();
		
		AtmMachine machine = new AtmMachine();
		
		try
		{
			machine.draw(amount);
		} 
		catch(AtmException e)
		{
			if(amount!=0)
			{
				System.out.println(e);
			}
			else 
			{
				System.out.println(e.getMessage());
			}
		}
	}
}
