package com.xworkz.hashcodeexampple;

public class Hasshcode_1 {

public static void main(String[] args){
	Hasshcode_1 a = new Hasshcode_1();
	   Hasshcode_1 b = new Hasshcode_1();
	int hashCode = b.hashCode();
	int hashCode2 = a.hashCode();
 if(hashCode==hashCode2)
 {
     System.out.println(hashCode+" "+hashCode2);
 }   
     System.out.println(hashCode+"!="+hashCode2);
}
}
