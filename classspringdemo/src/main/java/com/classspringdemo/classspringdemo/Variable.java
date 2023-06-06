package com.classspringdemo.classspringdemo;

public class Variable {
 
	
     static int a = 100;
     int b = 200;
	public static void main(String[] args) {
		int c = 300;
		System.out.println("Main Method");
		System.out.println(c);
		System.out.println("a:" +a);
		System.out.println("a:" +Variable.a);
		Variable v = new Variable();
		v.m1();
		System.out.println(v.a);
		System.out.println(v.b);
		
		//Another class
		System.out.println("c-Anohter class one"+DemoOne.c);
		DemoOne dom = new DemoOne();
		System.out.println("c-Anohter class two"+dom.c);
		System.out.println("c-Anohter class three"+ new DemoOne().c);
	}
	void m1() {
		
		System.out.println(a);
		System.out.println(b);
		
	}

}
