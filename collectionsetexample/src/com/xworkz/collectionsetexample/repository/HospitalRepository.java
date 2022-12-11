package com.xworkz.collectionsetexample.repository;

import com.xworkz.collectionsetexample.exception.HospitalException;
import com.xworkz.collectionsetexample.model.HospitalDTO;

public interface HospitalRepository {

	
	void add(HospitalDTO hospitaldetail) throws HospitalException;
   
	HospitalDTO getHospital(String hospitalName) throws HospitalException;
}
