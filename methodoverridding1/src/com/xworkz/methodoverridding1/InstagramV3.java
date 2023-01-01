package com.xworkz.methodoverridding1;

public class InstagramV3 extends InstagramV2 {

	
	 void upload()
	 {
		 super.upload();
		 System.out.println("upload :" + "video feature is added\n");
		 
	 }
	 void directMessage()
	 {
		 super.directMessage();
		 System.out.println("directMessage :" + "image feature added u can send to friends\n");
	 }
	 
	 void story()
	 {
		 System.out.println("story :" + "image is u can uploaded into story\n");
	 }
}
