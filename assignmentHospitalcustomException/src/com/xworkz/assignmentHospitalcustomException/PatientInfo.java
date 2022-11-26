package com.xworkz.assignmentHospitalcustomException;

import java.util.Objects;

public class PatientInfo {

	String name;
	double fee;
	
	
	
PatientInfo(String name,double fee)
{
	this.name= name;
	this.fee = fee;
	
}



@Override
public int hashCode() {
	return Objects.hash(fee, name);
}



@Override
public boolean equals(Object obj) {
	if (this == obj)
		return true;
	if (obj == null)
		return false;
	if (getClass() != obj.getClass())
		return false;
	PatientInfo other = (PatientInfo) obj;
	return Double.doubleToLongBits(fee) == Double.doubleToLongBits(other.fee) && Objects.equals(name, other.name);
}
	
	
}
