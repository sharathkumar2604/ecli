package com.xworkz.methodoverload;

public class HumanTest {

	public static void main(String[] args) {

           Human1 sharath = new Human1();
	       Unknown unknown=new Unknown();
	       Friend friend =new Friend();
	       sharath.speak(unknown);
	       sharath.speak(friend);
	}

}
