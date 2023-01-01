package com.xworkz.MethodOverriding;

public class Son extends Father{
	@Override
	void bike()
	{
		super.bike();
		System.out.println("father old bike modified by son ");
	}
	@Override
	void car()
	{
		super.car();

		System.out.println("father old car modified by son");
	}
	void bicycle()
	{
		System.out.println("my own bicycle");
	}
	
	public static void main(String[] args) {
		
		Son s = new Son();
		s.bike();
		s.car();
		s.bicycle();
		s.bus();
	}
}
