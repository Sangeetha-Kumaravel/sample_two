package com.classspringdemo.classspringdemo;

public class methodArguments {

	public static void main(String[] args) {
		
		methodArguments ma = new methodArguments();
		ma.method1();
		ma.method2(100);
		int a = ma.method3();
		System.out.println(a);
		int b = ma.method4(100);
		System.out.println(b);
	}


	void method1() {
		
		System.out.println("void method1");
		
	}
	
    void method2(int x) {
		
		System.out.println("void method2");
		return;
		
	}
    int method3() {
		
		System.out.println("non void method3");
		return 100;
		
	}

	 int method4(int x) {
		
		 System.out.println("non void method4");
		 return 200;
		
	}

}
