package com.classspringdemo.polymorphism;

public class outer {
	
	static int a = 10;
	static int b = 20;
	int c = 10; 
	//No Accessibility
	
	static class inner{
		
		static int a = 30;
		int b = 40;
		
		void m1() {
			
		int b = 50;
		
		System.out.println(outer.a);
		System.out.println(outer.b);
		System.out.println(a);
		System.out.println(this.b);
		System.out.println(b);
	
	}
	}
	

	public static void main(String[] args) {
		
		outer o = new outer();
		outer.inner oi = new outer.inner();
		oi.m1();

	}

}
