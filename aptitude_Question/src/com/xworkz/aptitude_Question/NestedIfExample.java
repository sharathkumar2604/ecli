package com.xworkz.aptitude_Question;

public class NestedIfExample {
	public static void main(String[] args) {
		{
			int x = 5;

			if (x <= 5) {

				System.out.println("lesser than ");

				                   if (x == 5)
				                         {
					                      System.out.println("equal");

				                         } else {
				                        System.out.println("not equal");
			                         	}
			} else {
				System.out.println("greater than number");
			}
		}
	}
}
