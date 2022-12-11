package com.xworkz.collectionsetexample.model;

import java.util.HashSet;

public class HospitalDTO {

	private String name;
	HashSet<DoctorDTO> doctors;
	
	public HospitalDTO()
	{
		
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public HashSet<DoctorDTO> getDoctors(){
		return doctors;
	}
	public void setDoctors(HashSet<DoctorDTO> doctors) {
		this.doctors = doctors;
	}
}
