package com.xworkz.Theater_one;

import com.xworkz.Theater_one.service.TheaterService;
import com.xworkz.Theater_one.service.TheaterServiceImpl;

public class TheaterRunner {

	public static void main(String[] args) {

		TheaterDTO dto=new TheaterDTO("1", "PVR_theater", 3, 50, true, 2, 4, 50,"btm", 11111,"kgf");
		TheaterDTO dto1=new TheaterDTO("2", "DRC_theater", 2, 60, true, 4, 5, 30,"rajajinagar", 22222,"kgf");
		TheaterDTO dto2=new TheaterDTO("3", "PVR_theater", 4, 70, true, 1, 7, 40,"btm mica", 333333,"kgf");
		TheaterDTO dto3=new TheaterDTO("4", "INOX_theater", 5, 80, false, 2, 4, 20,"btm jayadeva", 44444,"kgf");
		TheaterDTO dto4=new TheaterDTO("5", "RAJ_theater", 3, 90, true, 4, 3, 10,"jp nagar", 555555,"kgf");
		TheaterDTO dto5=new TheaterDTO("6", "WOODLAND_theater", 2, 30, true, 4, 4, 40,"marthalli", 666666,"kgf");
		TheaterDTO dto6=new TheaterDTO("7", "RAJKAMAL_theater", 4, 110, false, 3, 3, 40,"dollers road", 77777,"kgf");
		TheaterDTO dto7=new TheaterDTO("8", "STEEFHAN_theater", 5, 250, true, 2, 5, 50,"rajivnagar", 88888,"kgf");
		TheaterDTO dto8=new TheaterDTO("9", "MIRICHI_theater", 4, 150, false, 2, 3, 50,"kuvempunagar",99999,"kgf");
		TheaterDTO dto9=new TheaterDTO("10", "DRC_theater", 2, 120, false, 4, 2, 60,"whitefield", 11111,"kgf");
		TheaterDTO dto10=new TheaterDTO("11", "INOX_theater", 1, 110, true, 3, 4, 60,"banshankri", 11111,"kgf");
		TheaterDTO dto11=new TheaterDTO("12", "PVR_theater", 1, 90, true, 4, 5, 40,"rajarajeshwari", 11111,"kgf");
		TheaterDTO dto12=new TheaterDTO("13", "HABBITANT_theater", 4, 150, false, 1, 5, 50,"hebbal", 11111,"kgf");
		TheaterDTO dto13=new TheaterDTO("14", "CINI_theater", 2, 130, true, 2, 2, 40,"itpl", 11111,"kgf");
		TheaterDTO dto14=new TheaterDTO("15", "LAKSHMI_theater", 3, 140,false, 3, 4, 30,"silk board", 11111,"kgf");
		TheaterDTO dto15=new TheaterDTO("16", "DRC_theater", 4, 70, true, 2, 5, 30,"sarjapur", 11111,"kgf");
		TheaterDTO dto16=new TheaterDTO("17", "MISTRY_theater", 3, 80, false, 4, 3, 50,"kr market", 11111,"kgf");

		TheaterService service = new TheaterServiceImpl();
	    
		
		System.out.println(service.save(dto));
		service.save(dto1);
		service.save(dto2);
		service.save(dto3);
		service.save(dto4);
		service.save(dto5);
		service.save(dto6);
		service.save(dto7);
		service.save(dto8);
		service.save(dto9);
		service.save(dto10);
		service.save(dto11);
		service.save(dto12);
		service.save(dto13);
		service.save(dto14);
		service.save(dto15);
		service.save(dto16);
			}

}
