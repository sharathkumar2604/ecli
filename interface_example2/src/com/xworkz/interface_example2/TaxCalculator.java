package com.xworkz.interface_example2;

public class TaxCalculator implements StateTax,CentralTax{
	
	public void incomeTax()
	{
		System.out.println("income tax is Rs:100/-");
	}
    public void electricityTax()
    {
    	System.out.println("the electricity tax is Rs:50/-");
    }
}
