package com.classspringdemo.classspringdemo;

public class methodVoid {

	public static void main(String[] args) {
		
		System.out.println("main method starts");
		methodVoid mv = new methodVoid();
		mv.method1();
		
        int a = mv.method2();
		System.out.println(a);
		System.out.println(mv.method3());
		System.out.println("main method ends");
		

	}
	
	
	void method1() {
		System.out.println("void method1");
		
	}
	
	int method2() {
		System.out.println("Int method2");
		return 100;
			
	}
	int method3() {
		System.out.println("Int method3");
		return 100;
			
	}

}
