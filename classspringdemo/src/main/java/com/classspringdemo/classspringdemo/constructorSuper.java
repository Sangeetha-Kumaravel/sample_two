package com.classspringdemo.classspringdemo;

class constructorSuper {
	
	int a = 10;
	static int b= 20;
    void m1() {
		System.out.println("super class non static m1 method");
	}
	static void m2() {
		System.out.println("super class static m2 method");
	}
	
}

class constructorSub extends constructorSuper{
	
	int a = 30;
	static int b = 40;
	
	 @SuppressWarnings("static-access")
	void m1() {
		 
		    int a = 50;
			System.out.println("sub class non static m1 method");
			System.out.println(a);
			System.out.println(this.a);
			System.out.println(super.a);
			m2();
			this.m2();
			super.m1();
			super.m2();
		}
		static void m2() {
			System.out.println("sub class static m2 method");
		}}