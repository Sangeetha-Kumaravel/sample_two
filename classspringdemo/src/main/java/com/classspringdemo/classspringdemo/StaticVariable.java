package com.classspringdemo.classspringdemo;

public class StaticVariable {
	
	static int a = m1();
	
	static {
		System.out.println( "static Block 1");
	}
	
	static int m1() {
		System.out.println( "M1 Method");
		System.out.println( a );
		return 100;
	}
	
	static {
		System.out.println( "static Block 2");
	}

	public static void main(String[] args) {
		
		
		System.out.println( "Main Method");
		
	
	

	}

	

}
