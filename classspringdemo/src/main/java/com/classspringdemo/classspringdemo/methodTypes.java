package com.classspringdemo.classspringdemo;

public class methodTypes {
	
	void m1(byte b)
	{
		System.out.println("void method1");
	}
	public static void main(String[] args) {
		
		methodTypes mt = new methodTypes();
		mt.m1((byte)1000);

	}

}
