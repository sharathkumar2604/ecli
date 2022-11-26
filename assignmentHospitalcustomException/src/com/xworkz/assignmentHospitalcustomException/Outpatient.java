package com.xworkz.assignmentHospitalcustomException;

public class Outpatient {
public static void main(String[] args) {
	    
	
	Hospital info =new Hospital();
	
	
	try
	{
		info.patientsearch(new PatientInfo("raghu",111.11));
		
	}
	catch(HospitalException e)
	{
		System.out.println(e);
	}
}
}
