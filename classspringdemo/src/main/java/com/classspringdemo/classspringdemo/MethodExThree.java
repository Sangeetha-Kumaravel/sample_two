package com.classspringdemo.classspringdemo;

public class MethodExThree {

	
	 void m2(boolean b,float d) {
		System.out.println("Static Block");
		System.out.println(b);
		System.out.println(d);
	
	}
	 
	 void m1 (long l) {
		 System.out.println(l);
	 }
	public static void main(String[] args) {
		
		boolean b = true;
		float d = 10.5f;
		
		MethodExThree met = new MethodExThree();
		
		met.m2(b,d);
		met.m1((long)40);

	}

}
