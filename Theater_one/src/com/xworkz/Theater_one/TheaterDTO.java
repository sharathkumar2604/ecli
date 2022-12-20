package com.xworkz.Theater_one;

public class TheaterDTO {

	
	private String slno;
	private String theater_name;
	private int no_shows;
	private int no_seats;
	private Boolean  parking;
	private int no_screen;
	private int no_floors;
	private int no_workers;
	private String location;
	private int pincode;
	private String movie_name;
	
	//
	
	public TheaterDTO()
	{
		System.out.println("i am default constructor");
	}
	public TheaterDTO(String slno, String theater_name, int no_shows, int no_seats, Boolean parking, int no_screen,
			int no_floors, int no_workers, String location, int pincode, String movie_name) {
		super();
		this.slno = slno;
		this.theater_name = theater_name;
		this.no_shows = no_shows;
		this.no_seats = no_seats;
		this.parking = parking;
		this.no_screen = no_screen;
		this.no_floors = no_floors;
		this.no_workers = no_workers;
		this.location = location;
		this.pincode = pincode;
		this.movie_name = movie_name;
	}
	public String getSlno() {
		return slno;
	}
	public void setSlno(String slno) {
		this.slno = slno;
	}
	public String getTheater_name() {
		return theater_name;
	}
	public void setTheater_name(String theater_name) {
		this.theater_name = theater_name;
	}
	public int getNo_shows() {
		return no_shows;
	}
	public void setNo_shows(int no_shows) {
		this.no_shows = no_shows;
	}
	public int getNo_seats() {
		return no_seats;
	}
	public void setNo_seats(int no_seats) {
		this.no_seats = no_seats;
	}
	public Boolean getParking() {
		return parking;
	}
	public void setParking(Boolean parking) {
		this.parking = parking;
	}
	public int getNo_screen() {
		return no_screen;
	}
	public void setNo_screen(int no_screen) {
		this.no_screen = no_screen;
	}
	public int getNo_floors() {
		return no_floors;
	}
	public void setNo_floors(int no_floors) {
		this.no_floors = no_floors;
	}
	public int getNo_workers() {
		return no_workers;
	}
	public void setNo_workers(int no_workers) {
		this.no_workers = no_workers;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public int getPincode() {
		return pincode;
	}
	public void setPincode(int pincode) {
		this.pincode = pincode;
	}
	public String getMovie_name() {
		return movie_name;
	}
	public void setMovie_name(String movie_name) {
		this.movie_name = movie_name;
	}
	@Override
	public String toString() {
		return "TheaterDTO [slno=" + slno + ", theater_name=" + theater_name + ", no_shows=" + no_shows + ", no_seats="
				+ no_seats + ", parking=" + parking + ", no_screen=" + no_screen + ", no_floors=" + no_floors
				+ ", no_workers=" + no_workers + ", location=" + location + ", pincode=" + pincode + ", movie_name="
				+ movie_name + "]";
	}
	
	
	
	
	
	
	
}
