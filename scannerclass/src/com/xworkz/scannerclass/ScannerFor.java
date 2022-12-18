
package com.xworkz.scannerclass;

import java.util.Scanner;

public class ScannerFor
{
	void add(float a,float b)
{
		System.out.println("a:"  +a+   "b:"   +b+     "\n"  +(a+b));
}
	public static void main(String[] args) {
		
		ScannerAdd s=new ScannerAdd();
		//while(true) {
			for(int i=1;i<=3;i++) {
		System.out.println("enter ");
		Scanner scan = new Scanner(System.in);
		System.out.println("enter ");	
		float a=scan.nextFloat();
		System.out.println("enter ");
		float b=scan.nextFloat();
		 
		s.add(a,b);
	}
	
	}
}
//}