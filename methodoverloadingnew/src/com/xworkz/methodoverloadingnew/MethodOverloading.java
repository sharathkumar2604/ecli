package com.xworkz.methodoverloadingnew;

public class MethodOverloading {

	
  void display() {
	  System.out.println("hello");
	  
  }
  static void display(int x) {
	  System.out.println(x);
  }
  
  static int diplay(int x,int y) {
	  int a=x+y;
	  return a;
  }
  
  static void display(String x,int y) {      //static method and non static method can we overloading 
	  
	  System.out.println(x+" "+y);
  }
   void display(double d) {
	   System.out.println(d);
   }
   
   void display(int y,String x) {
	   System.out.println(y+" "+x);
	   
   }
   public static void main(String[] args)
   {
	   MethodOverloading mol= new MethodOverloading();
			   mol.display(10);
              display("eclipse", 10);          // for static - no need to specifies object reference to this 
              
               mol.display();                   //for non-static -we need to specifies object reference to this
             int a=  mol.diplay(10,20);
             System.out.println(a);
//               mol.display(16.2);
//               mol.display();
//               mol.display(10, "null");
//           
               
               
   }
}
