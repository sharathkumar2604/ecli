package com.xworkz.collection_map_program;

public class Customer {

	private String name;
	private String accNo;
	private String location;
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAccNo() {
		return accNo;
	}
	public void setAccNo(String accNo) {
		this.accNo = accNo;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	@Override
	public String toString() {
		return "Customer [name=" + name + ", accNo=" + accNo + ", location=" + location + "]";
	}
	

	
}
