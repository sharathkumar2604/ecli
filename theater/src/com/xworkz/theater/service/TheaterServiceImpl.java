package com.xworkz.theater.service;

import com.xworkz.theater.dto.TheaterDTO;
import com.xworkz.theater.repository.TheaterRepository;
import com.xworkz.theater.repository.TheaterRepositoryImpl;

public class TheaterServiceImpl implements TheaterService {
	TheaterRepository repository = new TheaterRepositoryImpl();

	@Override
	public Boolean validateAndSave(TheaterDTO dto) {
		String name = dto.getName();
		Double cost = dto.getCost();
		if (name != null && name.length() >= 3) {
			System.out.println("valid name");
			if (cost > 0 && cost < 500) {
				System.out.println("valid cost");
				Boolean save = repository.save(dto);
				System.out.println(dto);
			} else {
				System.out.println("invalid cost");
			}
		} else {
			System.out.println("invalid name");
		}

		return true;
	}

}
