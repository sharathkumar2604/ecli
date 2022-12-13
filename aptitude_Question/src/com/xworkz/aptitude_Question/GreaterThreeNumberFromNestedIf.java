package com.xworkz.aptitude_Question;

public class GreaterThreeNumberFromNestedIf {

	public static void main(String[] args) {

		int a = 15;
		int b = 22;
		int c = 33;

		System.out.println(a + " " + b + " " + c);
		if (a > b) {
			if (a > c) {
				System.out.println("a----> " +a + "  greater than all other b, c");

			} else

				System.out.println("c----> "+c + "  greater than all other a ,b");

		}

		else if (b > c) {
			System.out.println("b----> "+b + "  gretater than all other a,c");
		}

		else {
			System.out.println("c----> "+c + "" + "   gretaer than all other a,b ");
		}
	}

}
