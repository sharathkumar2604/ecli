package com.xworkz.aptitude_Question;

import java.util.Scanner;

public class LoginValidation {
	public static void main(String[] args) {

		System.out.println("MAGA BAAA");
	   Scanner myobj =new Scanner(System.in);
	   System.out.println(" ENTER USER NAME");
		String userName  =myobj.next();
		System.out.println(" ENTER PASSWARD");
		String password = myobj.next();
		
		System.out.println("enter username");
		if (userName=="admin" )
		{
			System.out.println("username is valid ");
			
		if(password=="admin123")
		{
			System.out.println("valid password");
			System.out.println("login sucessful");
			
		}
		else
		{
			System.out.println("invalid password");
		     System.out.println("login unsucessfull");
		}
		}
		else
		{
			System.out.println("invalid username or password");
			System.out.println("login unsucessful");
			
		}
		
		
	}

}
