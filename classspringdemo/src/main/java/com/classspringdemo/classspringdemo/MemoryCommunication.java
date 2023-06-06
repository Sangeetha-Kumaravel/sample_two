package com.classspringdemo.classspringdemo;

public class MemoryCommunication {
	
	static int a = 100;
	int b = 200;
	static int c = 500;
	
	public static void main(String[] args) {
		
		int c = 200;
		System.out.println("Main Method Starts");
		System.out.println("C:" + c);
		System.out.println("A:" + a);
		MemoryCommunication mc = new MemoryCommunication();
		System.out.println("MemoryCommunication b:" + mc.b);
		System.out.println("MemoryCommunication c:" + mc.c);
		mc.m1();
		System.out.println("ClassName" + MemoryCommunication.a);
		System.out.println("Reference a" + mc.a);
		System.out.println("Reference b" + mc.b);

	}
	void m1() {
		
		System.out.println("M1 Method Starts");
		System.out.println("B:" + b);
		System.out.println("A:" + a);
		
	}

}
