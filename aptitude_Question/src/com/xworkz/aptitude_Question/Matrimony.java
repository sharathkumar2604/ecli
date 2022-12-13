package com.xworkz.aptitude_Question;


public class Matrimony {

	public static void main(String[] args) {
System.out.println("Matrimony");
		String gender = "female";
		int age = 17;
		if (gender == "male") {
			System.out.println("Gender :" + gender);
			if (age >= 21) {

				System.out.println("Age :"+age);

				System.out.println("At age"+" "+age+" "+"You can marry ");

			} else {
				System.out.println("Age :"+age);
				System.out.println("At age"+age+" "+"you can't marry ");

			}

		}

		else {

			if (gender == "female") {
				System.out.println("Gender :" + gender);

				if (age >= 21) {
					System.out.println("Age :"+age);
					System.out.println("At age"+" "+age+" "+"You can marry ");
				} else {
					System.out.println("Age :"+age);
					System.out.println("At age"+" "+age+" "+"you can't marry ");					

				}

			}

		}
	}
}