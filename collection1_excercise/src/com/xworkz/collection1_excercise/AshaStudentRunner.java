package com.xworkz.collection1_excercise;

import java.util.LinkedList;
import java.util.List;

public class AshaStudentRunner {

	public static List<AshaStudent> ashaStudentList() {
		AshaStudent studentSharath = new AshaStudent("Sharath",25);
		AshaStudent studentChidhu = new AshaStudent("Chidhu",24);
		AshaStudent studentMalathesh = new AshaStudent("Malathesh",22);
		AshaStudent studentDarshan = new AshaStudent("Darshan",26);
		AshaStudent studentRohan = new AshaStudent("Rohan",25);
		AshaStudent studentSimha = new AshaStudent("Simha",20);

		LinkedList<AshaStudent> details = new LinkedList<AshaStudent>();
		details.add(studentSharath);
		details.add(studentChidhu);
		details.add(studentMalathesh);
		details.add(studentDarshan);
		details.add(studentRohan);
		details.add(studentSimha);
		return details;
	}

	public static void main(String[] args) {

		List<AshaStudent> list = AshaStudentRunner.ashaStudentList();
		System.out.println(list);
	}
}
