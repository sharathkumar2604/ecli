package com.xworkz.theater.dto;

public class TheaterDTO {
	
	private Integer sl_no;
	private Boolean Parking;
	private String name;
	private String location;
	private Integer no_of_floors;
	private Double cost;
	private Integer contact_number;
	private Integer zipcode;
	private String Country;
	private Integer capacity;
	public TheaterDTO() {
		System.out.println("Default constructor");
	}
	
	public Integer getSl_no() {
		return sl_no;
	}
	public void setSl_no(Integer sl_no) {
		this.sl_no = sl_no;
	}
	public Boolean getParking() {
		return Parking;
	}
	public void setParking(Boolean parking) {
		Parking = parking;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public Integer getNo_of_floors() {
		return no_of_floors;
	}
	public void setNo_of_floors(Integer no_of_floors) {
		this.no_of_floors = no_of_floors;
	}
	public Double getCost() {
		return cost;
	}
	public void setCost(Double cost) {
		this.cost = cost;
	}
	public Integer getContact_number() {
		return contact_number;
	}
	public void setContact_number(Integer contact_number) {
		this.contact_number = contact_number;
	}
	public Integer getZipcode() {
		return zipcode;
	}
	public void setZipcode(Integer zipcode) {
		this.zipcode = zipcode;
	}
	public String getCountry() {
		return Country;
	}
	public void setCountry(String country) {
		Country = country;
	}
	@Override
	public String toString() {
		return "TheaterDTO [sl_no=" + sl_no + ", Parking=" + Parking + ", name=" + name + ", location=" + location
				+ ", no_of_floors=" + no_of_floors + ", cost=" + cost + ", contact_number=" + contact_number
				+ ", zipcode=" + zipcode + ", Country=" + Country + ", capacity=" + capacity + "]";
	}
	public Integer getCapacity() {
		return capacity;
	}
	public void setCapacity(Integer capacity) {
		this.capacity = capacity;
	}
	public TheaterDTO(Integer sl_no, Boolean parking, String name, String location, Integer no_of_floors, Double cost,
			Integer contact_number, Integer zipcode, String country, Integer capacity) {
		
		this.sl_no = sl_no;
		Parking = parking;
		this.name = name;
		this.location = location;
		this.no_of_floors = no_of_floors;
		this.cost = cost;
		this.contact_number = contact_number;
		this.zipcode = zipcode;
		Country = country;
		this.capacity = capacity;
	}
	
	
	

}
