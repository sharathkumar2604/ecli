package com.xworkz.methodoverall;

public class MethodOverAll {
   void m1()
   {
	   System.out.println("hello");
	   
   }
   void m2(int a,int b)
   {
	   int res=a+b;
	   System.out.println(res);
	   
   }
   
    String m3()
   {
	   return "shara";
	   
   }
   
   int m4(int a,int b)
   {
	   int sum=a+b;
	 
      return sum;
      
   }
 
   public static void main(String[] args) {
	   
	   
	MethodOverAll obj =new MethodOverAll();
	obj.m1();
	obj.m2(10, 20);
	//System.out.println(mahesh);
	String mahesh2 =obj.m3();
	
	System.out.println(mahesh2);
	
	int mahesh1=obj.m4(11, 22);
	System.out.println(mahesh1);
	
}
	
	
}
