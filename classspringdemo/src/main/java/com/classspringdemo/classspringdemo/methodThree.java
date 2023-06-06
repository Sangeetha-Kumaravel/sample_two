package com.classspringdemo.classspringdemo;

public class methodThree {

	
	int a = m1();
	public static void main(String[] args) {
		
		methodThree mt = new methodThree();
		mt.m2();
		new methodThree().m2();
		methodTwo mt1 = new methodTwo();
		mt1.m3();
		new methodTwo().m3();

	}
  
	 int m1() {
		 
		 m2();
		 System.out.println("Int m1 method");
		 return 10;
		
	}
	 void m2() {
		 System.out.println("void m2 method");
	 }

}
