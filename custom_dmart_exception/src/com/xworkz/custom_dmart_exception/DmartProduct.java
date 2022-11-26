package com.xworkz.custom_dmart_exception;

import java.util.Objects;

public class DmartProduct {
	String name;
	double price;
	String qty;
   
	DmartProduct(String name,double price,String qty)
	{
		this.name=name;
		this.price=price;
		this.qty=qty;
	}

	@Override
	public int hashCode() {
		return Objects.hash(name, price, qty);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		DmartProduct other = (DmartProduct) obj;
		return Objects.equals(name, other.name)
				&& Double.doubleToLongBits(price) == Double.doubleToLongBits(other.price)
				&& Objects.equals(qty, other.qty);
	}
	
	
	}


