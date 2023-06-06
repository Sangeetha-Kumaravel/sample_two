package com.classspringdemo.classspringdemo;

public class methodArgumentTwo {
	
	
   void m1(boolean b) {
	   System.out.println("Boolean method1");
	   System.out.println(b);
   }
   
   void m2(String s) {
	   System.out.println("String method2");
	   System.out.println(s);
   }
   
   void m3(DemoOne d) {
	   System.out.println("String method2");
	   System.out.println(d.a+"..."+d.b);
   }
	public static void main(String[] args) {
		
		methodArgumentTwo mat = new methodArgumentTwo();
		mat.m1(true);
		mat.m2("Sangeetha");
		DemoOne d = new DemoOne();
		mat.m3(d);
	}

}
