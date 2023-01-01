package com.xworkz.methodoverridding1;

public class InstagramRunner {

	public static void main(String[] args) {
		
		InstagramV3 insta = new InstagramV3();
		System.out.println("============");
		insta.directMessage();
		System.out.println("============");
		insta.upload();
		System.out.println("============");
		insta.story();
		
		
	}
}
