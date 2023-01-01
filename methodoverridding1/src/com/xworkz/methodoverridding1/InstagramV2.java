package com.xworkz.methodoverridding1;

public class InstagramV2 extends InstagramV1{

	void upload()
	{
		super.upload();
		System.out.println("upload :" + "gif feature is added\n");
	}
	void directMessage()
	{
		System.out.println("directMessage :" + "new test featured added\n");
	}
}
