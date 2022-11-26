package com.xworkz.practice_exception;

public class Mobiles {
	
	
	Brands[] brands= {new Brands("apple",70000.000),
			          new Brands("samsung",66000.000),
			          new Brands("nokia",44000.000),
			          new Brands("oppo",18000.000)};
	
	
	
	void search(Brands brand)
	{
		boolean isBrandAvailable =false;//
		
		for (int i=0;i<brands.length;i++)
		{
			if(brands[i].equals(brand))
			{
			isBrandAvailable= true;
			
		}
		}
	     if(isBrandAvailable)
	     {
	    	 System.out.println("available");
	     }
	     else
	     {
	    	 throw new GadgetsException();
	     }
	}
	
	}
	
	
