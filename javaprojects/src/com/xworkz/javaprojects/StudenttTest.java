package com.xworkz.javaprojects;

public class StudenttTest {
	public static void main(String[] args) {
		
		
		Studentt stu = new Studentt();
		
		Studentt stu1 = new Studentt();
		
		
		stu.name="Sharath";
		stu.id="4ad10mm58";
		stu.college="ATME";
		
		stu1.name="Chandana";
		stu1.id="4ashgag598";
		stu1.college="JSS";
		
		
	System.out.println("Student name :"+stu.name +  "  "  +  "   "+"Student id :"  +stu.id+  "   "+"Student College"+ stu.college);
	System.out.println("Student name :"+stu1.name +  "  "  +  "  "+"Student id :"  +stu1.id+  "  "+"Student College" +stu1.college);
	}

}
