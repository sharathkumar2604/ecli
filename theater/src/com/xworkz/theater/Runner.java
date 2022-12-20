package com.xworkz.theater;

import com.xworkz.theater.dto.TheaterDTO;
import com.xworkz.theater.repository.TheaterRepository;
import com.xworkz.theater.repository.TheaterRepositoryImpl;
import com.xworkz.theater.service.TheaterService;
import com.xworkz.theater.service.TheaterServiceImpl;

public class Runner {
	
	public static void main(String[] args) {
		TheaterDTO theaterDTO = new TheaterDTO();
		theaterDTO.setSl_no(1);
	    theaterDTO.setParking(true);
	    theaterDTO.setNo_of_floors(4);
	    theaterDTO.setName("ba");
	    theaterDTO.setLocation("btm");
	    theaterDTO.setCapacity(500);
	    theaterDTO.setCountry("indian");
	    theaterDTO.setContact_number(899696896);
	    theaterDTO.setCost(80.0);
	    theaterDTO.setZipcode(8794359);
	    
	    
		
		TheaterService theaterService = new TheaterServiceImpl();
		Boolean validateAndSave = theaterService.validateAndSave(theaterDTO);
	
		//System.out.println(validateAndSave);

}
}
