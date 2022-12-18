package com.xworkz.methodcreation;
//method with arguments with return type
public class MethodCreation4 {

	
	int display(int a,int b)
	{
		int sum=a+b;
		return sum;
		
	}
	public static void main (String[] args) {
		MethodCreation4 mwawrt = new MethodCreation4();
		int res = mwawrt.display(10,20);
		System.out.println(res);
	}
}
