package com.xworkz.ArrayExamples;

import java.util.Scanner;

public class ArrayOcurance {
public static void main(String[] args) {
	
Scanner scan = new Scanner(System.in);

System.out.println("enter the size of an array");

int size=scan.nextInt();
System.out.println("enter the values for "+size+"arrays");

int[] a = new int[size];

int count=0;
for(int i=0;i<a.length;i++)
{
	a[i]=scan.nextInt();
}
System.out.println("enter the elements for no of occurance");
int element=scan.nextInt();

for(int i=0;i<a.length;i++)
{
	if(a[i]==element)
	{
	count++;
	
	}
}
System.out.println("no of occurance "+element+"is"+count);


}
}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	//System.out.println("enter the value for array occurance");
//	Scanner scan= new Scanner(System.in);
//	System.out.println("enter the size of an array");
//	int size= scan.nextInt();
//	
//	
//	int[]a = new int[size];
//	
//
//	System.out.println("enter the number "+size);

	
	
	
	
	
//	for(int i=0;i<a.length;i++)
//	{
//}
//	System.out.println("array elements arre");
//for (int i=0;i<a.length;i++)
//{
//	System.out.println(a[i]);
//}
//	
//	
//	
//	
//System.out.println("enter the elemts to be find the occurance:");	
//int element =scan.nextInt();
//int count=1;
//for(int i=0;i<a.length-1;i++)
//{
//	a[i]=scan.nextInt();
//	if(element==a[i])
//	{
//		count++;
//		
//	}
//}
//System.out.println("no of occurance of"+element+"is"+count);
//}
//}