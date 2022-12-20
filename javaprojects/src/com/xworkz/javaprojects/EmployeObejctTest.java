package com.xworkz.javaprojects;

public class EmployeObejctTest {
public static void main(String[] args) {
	  
	EmployeeObject empobj = new EmployeeObject();
	
	EmployeeObject empobj1 = new EmployeeObject();
	
	 empobj.name="sharath";
	 empobj.id=001;
	 empobj.salary=200000;
	 
	 empobj1.name="chandana";
	 empobj1.id=002;
	 empobj1.salary=250000;
	 
	 System.out.println("SLNO:1"+" "+empobj.name+"  "+empobj.id+" "+empobj.salary);
	 
	 System.out.println("SLNO:2"+" " +empobj1.name+" "+empobj1.id+" "+empobj1.salary);
	
}
}
