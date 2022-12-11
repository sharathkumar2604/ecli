package com.xworkz.constructor;

public class ConstructorClass {

	String name;
	String color;
	int a;
	int b;
	
	int add;

	
	ConstructorClass(int a1,int b1)
	{
		//this.a=a1;
		//this.b=b1;
		
		System.out.println("i am parameter constructor");
       add=a1+b1;
        System.out.println(add);
	}
	ConstructorClass()
	{
		
     System.out.println("iam default constructor");
	}

}
