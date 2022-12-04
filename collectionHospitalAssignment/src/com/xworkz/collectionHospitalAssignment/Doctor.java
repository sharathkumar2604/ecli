package com.xworkz.collectionHospitalAssignment;

public class Doctor {
 
	
	String name;
	String specialize;
	//String hospital_name;
	
	
	Doctor(String name,String specialize){
		this.name =name;
		this.specialize=specialize;
		//this.hospital_name=hospital_name;
		
	}


	@Override
	public String toString() {
		return "Doctor [name=" + name + ", specialize=" + specialize + "]";
	}


	
}

