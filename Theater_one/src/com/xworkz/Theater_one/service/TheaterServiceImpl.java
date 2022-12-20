package com.xworkz.Theater_one.service;

import com.xworkz.Theater_one.TheaterDTO;
import com.xworkz.Theater_one.repository.TheaterRepo;
import com.xworkz.Theater_one.repository.TheaterRepoImpl;

public class TheaterServiceImpl implements TheaterService {

	TheaterRepo repo = new TheaterRepoImpl();

	@Override
	public boolean save(TheaterDTO dto) {
		if (dto != null) {
			System.out.println("entered dto is not null");
			if (dto.getTheater_name().length() >= 3) {
				repo.save(dto);
System.out.println("data received");
			}
		} else {
			return false;
		}
		return false;

	}

	@Override
	public boolean read(TheaterDTO dto) {
		
		
		
		
		return false;
	}

}
