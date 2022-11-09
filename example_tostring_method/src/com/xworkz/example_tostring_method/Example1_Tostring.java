package com.xworkz.example_tostring_method;

public class Example1_Tostring {

	String name1="sharath";
	public static void main(String[] args) {
  
		
				
				Example1_Tostring s = new Example1_Tostring();//create new object reference 's' new class name press ctrl+2 and press l
	              String string = s.toString(); //and call the obeject reference . and then select toString method and press ctrl+2 and prees l
	              System.out.println(string);//porint the string 
	}

	@Override                           // this is to override not toprint  "fully collified object " means package+class name followed by some hashcode 
	public String toString() {//
		return "Example1_Tostring[name1:" +name1+ "]";// return class name and initialize the string name
	}

	
}