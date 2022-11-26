package com.xworkz.aptitude_fibbu1;

public class wRAPPER {

	public static void main(String[] args) {
		int m = 202;//
//		Integer valueOf = Integer.valueOf(m);
//		String string = valueOf.toString();
//		StringBuffer stringBuffer = new StringBuffer(string);
//		stringBuffer.reverse();
//		String string2 = stringBuffer.toString();
//		Integer valueOf2 = Integer.valueOf(string2);
//		int parseInt = Integer.parseInt(string2);
//		System.out.println(parseInt);
//		if(parseInt==valueOf2) {
//			
//			System.out.println("yes");
//		}
//		else {
//			System.out.println("not");
//		}
		
		int rem , r=0,temp=m;
		 while(m>0) {
			 
			rem=m%10;
			r=(r*10)+rem;
			m=m/10;
		 }
		 if(temp==r) {
			 
			 System.out.println("yesakgjyf");
		 }
	}
}
