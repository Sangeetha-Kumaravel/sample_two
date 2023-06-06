package com.classspringdemo.classspringdemo;

public class methodOne {
     
	static void m1() {
		System.out.println("static m1 method");
	}
	@SuppressWarnings("static-access")
	public static void main(String[] args) {
		
		methodOne mo = new methodOne();
		
		
		//same class
		m1();
		methodOne.m1();
		mo.m1();
		new methodOne().m1();
		
		//another class
		
		methodTwo.m2();
		methodTwo mt = new methodTwo();
		mt.m2();
		new methodTwo().m2();
		
		
		

	}

}
