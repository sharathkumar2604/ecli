package com.xworkz.reversestring_aptitude;

import java.util.Scanner;

public class ReverseString {
	
	 public static void main(String[] args)
	 {
	 System.out.println("Enter string to reverse:");
	 
	 Scanner take = new Scanner(System.in);
	 String str = take.nextLine();
	 String reverse = "";
	 
	 
	 for(int i = str.length() - 1; i >= 0; i--)
	 {
	 reverse = reverse + str.charAt(i);
	 }
	 
	 System.out.println("Reversed string is:");
	 System.out.println(reverse);
	 }
	}

