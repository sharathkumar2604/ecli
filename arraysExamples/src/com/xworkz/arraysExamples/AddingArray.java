package com.xworkz.arraysExamples;

import java.util.Scanner;

public class AddingArray {


public static void main(String[] args) {
	Scanner myobj = new Scanner(System.in);
	
	System.out.println(":->>>> adding two arrays <<<<-:");
System.out.println("enter the size for 1st array");
	int size=myobj.nextInt();
    System.out.println("enter the size for 2nd array");
    
    int size1=myobj.nextInt();
    
    int[]a = new int[size];
    
    int[]b = new int[size1];
    
    System.out.println("enter the values for 1st array for the "+size);
    
    for(int i=0;i<a.length;i++)
    {
    	a[i]=myobj.nextInt();
    	
    	//System.out.println("i am 1");
    	
    }
    System.out.println("1st array done");
    System.out.println("enter the values for array 2nd array for the "+size1);
    for (int j=0;j<b.length;j++)
    {
    	
    	b[j]=myobj.nextInt();
    	//System.out.println("i am 2");
    }
	System.out.println("2nd array done");
    
    //System.out.println("adding two arrays ");
  
    int array1=a.length;
   if(a.length==array1)
   {
	   
  if(b.length==a.length)
	  
   {
   for(int k=0;k<=a.length-1&&k<=b.length-1;k++)
    {
	   int i = 0;
	   int j = 0;
	   
	   int c=a[i]+b[j];
    	System.out.println("Sum "+ c);
	   
    }
   }
   else 
   {
	   System.out.println("a array size"+a.length +"\nb array size"+b.length+"\n has miss match in size can't add ");
   }
   }
   else
   {
	   System.out.println("a array size"+a.length +"\nb array size"+b.length+"\n miss match in size can't add");
   }
}
}

