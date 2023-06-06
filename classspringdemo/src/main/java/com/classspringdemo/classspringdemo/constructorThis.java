package com.classspringdemo.classspringdemo;

public class constructorThis {
	
	int a = 10;
	int b = 20;
	
	void m1() {
		
		int a = 10;
		int b = 20;
		
		System.out.println("m1 method");
		System.out.println(this.a +"..."+this.b);
		System.out.println(a +"..."+b);
		
	}

	public static void main(String[] args) {
		
		constructorThis ct = new constructorThis();
		ct.a = 100;
		ct.b = 200;
		System.out.println(ct.a +"..."+ct.b);
		ct.m1();
		

	}

}
