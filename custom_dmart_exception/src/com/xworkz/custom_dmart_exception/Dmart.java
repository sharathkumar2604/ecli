package com.xworkz.custom_dmart_exception;

public class Dmart {

	DmartProduct[] products = {new DmartProduct("soap",10.00,"500grams"),
               			  new DmartProduct("soap",10.00,"500grams"),
			              new DmartProduct("soap",10.00,"500grams"),
			              new DmartProduct("soap",10.00,"500grams")};
	void search(DmartProduct product) throws DmartException
	{
		boolean isProductAvailable = false;
		for (int i=0;i< products.length;i++)
		{
			if(products[i].equals(product)) {
				isProductAvailable = true;
		
			}
		}
            if(isProductAvailable)
            {
            	System.out.println("product found");
            }
            else
            {
            	throw new DmartException();
            }
	}
	
            }
	

