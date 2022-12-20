package com.xworkz.theater.repository;

import com.xworkz.theater.dto.TheaterDTO;

public interface TheaterRepository {

	Boolean save(TheaterDTO dto);

	TheaterDTO findById(Integer id);

}
