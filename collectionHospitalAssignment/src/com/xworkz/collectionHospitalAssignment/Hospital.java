package com.xworkz.collectionHospitalAssignment;

import java.util.ArrayList;

public class Hospital {

	
	String name;
	
	ArrayList<Doctor> doctors;
	
	Hospital(String name,ArrayList<Doctor> doctors) 
	{
		this.name=name ;
		this.doctors=doctors;
		
	}

	@Override
	public String toString() {
		return "Hospital [name=" + name + ", doctors=" + doctors + "]";
	}

}

