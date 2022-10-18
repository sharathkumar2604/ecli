package com.xworkz.methodoverload;

class Human {
	void speak(String person) {
		System.out.print("1 method");

	}

	void speak(int person,String name) {
		System.out.print("2nd method");
	}
	public static void main(String[] args) {
		Human human = new Human();
		human.speak("hgcgh");
		human.speak(1, "gd");
		
	}
}

