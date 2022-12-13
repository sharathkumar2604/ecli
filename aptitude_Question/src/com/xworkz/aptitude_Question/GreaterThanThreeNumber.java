package com.xworkz.aptitude_Question;

public class GreaterThanThreeNumber {

	public static void main(String[] args) {
		
		
		 int a=1;
		 int b=2;
		 int c=3;
		 
		 System.out.println(a+" " +b+" "+c );
		 if(a>b) {
			  if(a>c)
			  {
				  System.out.println(a+"greater than all other b, c");
				  
			  }
			  else 
				
				  System.out.println(c+"greater than all other a ,b");
                 	
		 	 
		        }
	
	            else if(b>c) {
		System.out.println(b+"is gretater than all other a,c");
	}

	            else
	            {
	            	System.out.println(c+"is gretaer than all other a,b ");
	            }
	}
	
}