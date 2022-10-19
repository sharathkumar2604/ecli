package com.xworkz.methodoverloading;

public class MainMethod1Overload {

	public static void main(String[] args) {
		Method1OverLoading m1=new Method1OverLoading();
		m1.add(1,1);
		m1.add(2.8f, 3.5f);
		System.out.println("the addition of interger number"+m1.add(1,1));
		System.out.println("the addition of floatindg number"+m1.add(2.8f, 3.5f));
	}

}
