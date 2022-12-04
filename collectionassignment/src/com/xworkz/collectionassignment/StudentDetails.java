package com.xworkz.collectionassignment;

import java.util.ArrayList;
import java.util.ListIterator;

public class StudentDetails {
	public static void main(String[] args) {
		Student sharath = new Student("sharath", "001", "ATME");
		Student bharath = new Student("bharath", "002", "NIE");
		Student harshith = new Student("harshith", "003", "SJBC");
		Student gopal = new Student("gopal", "004", "RIT");
		Student giri = new Student("giri", "005", "AMIT");
		Student shreya = new Student("shreya", "006", "IIT");
		
		ArrayList<Student> ashaStudentList= new ArrayList<Student>();
		ashaStudentList.add(sharath);
		ashaStudentList.add(bharath);
		ashaStudentList.add(harshith);

		ArrayList<Student> omkarStudentList = new ArrayList<Student>();

		omkarStudentList.add(gopal);
		omkarStudentList.add(giri);
		omkarStudentList.add(shreya);

		Trainer asha = new Trainer("Asha", ashaStudentList);
		Trainer omkar = new Trainer("Omkar", omkarStudentList);

		ArrayList<Trainer> trainerList = new ArrayList<Trainer>();

		trainerList.add(asha);
		trainerList.add(omkar);

		ListIterator<Trainer> itr = trainerList.listIterator();
		//Trainer trainer = itr.next();
		while(itr.hasNext()) {
			Trainer next = itr.next() ;
			if(next.name.equals("Omkar")) {
				
				System.out.println(next);
			}
			
		}
//		if (trainer.name.equals("Omkar")) {
//
//			System.out.println("Asha's student details:");
//			ArrayList<Student> students = trainer.students;
//			System.out.println(students);
//		}

	}

}
