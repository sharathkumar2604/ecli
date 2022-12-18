package com.xworkz.staticandnonstatic;

import java.util.Scanner;

public class Staticone {

	int a = 20;
	static int b = 20;

	int add(int a, int b) {
		this.a = a;
		this.b = b;

		int c = a + b;

		return c;

	}

	public static void main(String[] args) {
		Staticone s = new Staticone();
		Scanner scan = new Scanner(System.in);
		System.out.println("enter thhe values");
		int a = scan.nextInt();
		System.out.println("enter thhe values");
		int b = scan.nextInt();
		int c = s.add(a, b);
		System.out.println(c);

	}
}
