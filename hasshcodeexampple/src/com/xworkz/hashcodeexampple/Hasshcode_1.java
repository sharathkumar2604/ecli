package com.xworkz.hashcodeexampple;

public class Hasshcode_1 {

	public static void main(String[] args) {
		Hasshcode_1 a = new Hasshcode_1();
		Hasshcode_1 b = new Hasshcode_1();

		int hashCode   = a.hashCode();
		int hashCode2  = b.hashCode();
		//int hashCode2 = hashcode; will write same hashcode of hashcode to hashcode of hashcode2
	
		if (hashCode == hashCode2) {
			System.out.println(hashCode + "= " + hashCode2);
		}
		else
		{
		System.out.println(hashCode + "!=" + hashCode2);
	}
}
}

