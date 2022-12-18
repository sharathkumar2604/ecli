package com.xworkz.scannerclass;

import java.util.Scanner;

public class EmployeeScanner {

	public static void main(String[] args) {
		
		
		System.out.println("enter student details ");
		
		 Scanner s =new Scanner(System.in);
		 
		 System.out.println("enter the name");
		 
		 String name = s.next();
		 
		 System.out.println("enter student age ");
		 
		 int age = s.nextInt();
		 
		 System.out.println("college name");
		 
		 String college = s.next();
		   
		 
		 System.out.println(name+"\n"+age+"\n"+college);
		 
	}
}
