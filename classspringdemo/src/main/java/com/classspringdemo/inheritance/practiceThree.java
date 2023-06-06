package com.classspringdemo.inheritance;

class practiceThree {
	
	int a = 100;
	static int b = 200;
	static void m1() {
		
		System.out.println("super class m1 method");
	}
    
	void m2() {
		
		System.out.println("super class m2 method");
	}
}

class practiceFour extends practiceThree {
	
	int a = 300;
	static int b = 400;
	static void m1() {
		
		System.out.println("sub class m1 method");
	}
    
	void m2() {
		
		//int a = 50;
		System.out.println("sub class m2 method");
		System.out.println(a);
		System.out.println(this.a);
		System.out.println(super.a);
		super.m1();
		super.m2();
		this.m1(); // m1();
		
		
	
}}
