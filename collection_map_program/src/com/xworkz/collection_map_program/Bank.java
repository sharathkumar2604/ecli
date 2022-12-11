package com.xworkz.collection_map_program;

public class Bank {

	private String bankName;
	private String location;
	public String getBankName() {
		return bankName;
	}
	public void setBankName(String bankName) {
		this.bankName = bankName;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	@Override
	public String toString() {
		return "Bank [bankName=" + bankName + ", location=" + location + "]";
	}

}
