package com.xworkz.aptitude_Question;

import java.util.Scanner;

public class Reverse {
public static void main(String[] arge)
{
	
	Scanner sc=new Scanner(System.in);  
	System.out.print("Enter a String: \n");  
	String s=sc.next();                    //reading string from user  
	System.out.print("After reverse string is: ");  
	for(int i=s.length();i>0;i--)                //i is the length of the string  
	{  
	System.out.print(s.charAt(i-1));            //printing the character at index i-1  
	}  
	}  
	}  
