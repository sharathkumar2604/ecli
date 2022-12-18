package com.xworkz.aptitude_Question;
import java.util.Scanner;
public class EvenNumberDIfferntly {
	public static void main(String[] args) {
   System.out.println(("enter the number to get even number till given number"));
		Scanner n = new Scanner(System.in);
	int a	=n.nextInt();
	
				
             
 
			for (int i = 0; i <=a; i++) {
				if (i % 2 == 0) {

					System.out.println(i + " :is even number");
				} else {
					System.out.println("****************");
				}
			}
			System.out.println("thank u");
		}

	
}