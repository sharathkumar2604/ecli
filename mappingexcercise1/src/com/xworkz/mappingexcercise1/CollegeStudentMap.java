package com.xworkz.mappingexcercise1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class CollegeStudentMap {

	public static void main(String[] args) {

		College c = new College();
		c.setName("JAIN");
		c.setLocation("Hubli");
		c.setPincode(5000130);

		College c1 = new College();
		c1.setName("Xworkz");
		c1.setLocation("Btm");
		c1.setPincode(5600029);

		Student s = new Student();
		s.setName("Rohan");
		s.setMobilenumber(99999999999l);
		s.setId(5011);

		Student s1 = new Student();
		s1.setName("Chidu");
		s1.setMobilenumber(888888888888l);
		s1.setId(5012);

		Student s2 = new Student();
		s2.setName("Madhu");
		s2.setMobilenumber(777777777777l);
		s2.setId(5013);

		Student s3 = new Student();
		s3.setName("Manoj");
		s3.setMobilenumber(6666666666666l);
		s3.setId(5014);

		ArrayList<Student> students = new ArrayList();
		students.add(s);
		students.add(s3);

		ArrayList<Student> students1 = new ArrayList();
		students1.add(s1);
		students1.add(s2);

		HashMap<College, ArrayList<Student>> cs = new HashMap<>();

		cs.put(c, students);
		cs.put(c1, students1);

		for (Map.Entry<College, ArrayList<Student>> entry : cs.entrySet()) {

			if (entry.getKey().getName().equals("JAIN")) {
				System.out.println("Jain college student details:");
				for (Student stu : entry.getValue()) {

					System.out.println("name :" + stu.getName() + " ");
					System.out.println("student mobile number :" + stu.getMobilenumber());
					System.out.println("student id  : " + stu.getId());

					System.out.println();
				}

			}
		}
	}
}