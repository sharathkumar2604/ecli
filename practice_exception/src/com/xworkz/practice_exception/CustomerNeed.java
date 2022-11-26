package com.xworkz.practice_exception;

public class CustomerNeed {

	public static void main(String[] args) {
		Mobiles now = new Mobiles();
				
				try
		{
					now.search(new Brands("apple",70000.000));
					
		}
	 catch(GadgetsException a)
				{
		 System.out.println(a);
				}
	}
	
}
