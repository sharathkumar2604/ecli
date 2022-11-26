package com.xworkz.assignmentHospitalcustomException;

public class Hospital {
	
	PatientInfo[] patientdetails = {new PatientInfo("ravi" , 150.00),
			                           new PatientInfo("ramesh" , 100.00),  
			                           new PatientInfo("punith" , 200.00)};

	
	      void patientsearch(PatientInfo info) throws HospitalException
	      {
	    	  boolean isPatientAvailable=false;
	    			  
	    			  for(int i=0 ; i<patientdetails.length;i++)
	    			  {
	    				  if (patientdetails[i].equals(info))
	    				  {
	    			      isPatientAvailable=true;
	    			     
	    				  }
	    				if(isPatientAvailable )
	    				{
	    					System.out.println("registered patient");
	    				}
	    				  
	    				  else 
	    				  {
	    					  throw new HospitalException();
	    				  }
	    			  }
	      }
}



