package com.xworkz.object;

public class HasshCode {
	
	
	
	
	
	
	
	public static void main(String[] args) {
		HasshCode child = new HasshCode();
		HasshCode child2 = new HasshCode();
		HasshCode child3=child2;
		int hashCode3 = child3.hashCode();
		int hashCode = child.hashCode();
		int hashCode2 = child2.hashCode();
		if(hashCode3==hashCode2) {
			
			System.out.println("same");
		}
		else {
			
			System.out.println("no");
		}
		
		
		
		
	}
}
