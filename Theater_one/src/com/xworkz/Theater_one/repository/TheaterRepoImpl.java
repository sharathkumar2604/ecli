package com.xworkz.Theater_one.repository;

import java.util.ArrayList;
import java.util.List;

import com.xworkz.Theater_one.TheaterDTO;

public class TheaterRepoImpl implements TheaterRepo {
//
	List<TheaterDTO> list = new ArrayList<TheaterDTO>();

	@Override
	public boolean save(TheaterDTO dto) {
		System.out.println("data is now in repo");
		list.add(dto);
System.out.println(dto);
		return false;
	}

}
