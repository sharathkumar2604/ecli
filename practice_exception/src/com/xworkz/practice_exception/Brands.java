package com.xworkz.practice_exception;

import java.util.Objects;

public class Brands {
	
	String brandName;
	double price;
	
	Brands(String brandName,double price)
	{
		this.brandName=brandName;
		this.price=price;//
		
	}

	@Override
	public int hashCode() {
		return Objects.hash(brandName, price);//
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Brands other = (Brands) obj;
		return Objects.equals(brandName, other.brandName)
				&& Double.doubleToLongBits(price) == Double.doubleToLongBits(other.price);
	}

}
