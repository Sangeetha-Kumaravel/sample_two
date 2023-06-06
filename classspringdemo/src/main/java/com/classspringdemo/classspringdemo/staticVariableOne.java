package com.classspringdemo.classspringdemo;

public class staticVariableOne {

	
	  static int a = 10;
	  static int b = 20;
	
	public static void main(String[] args) {
		
		 System.out.println("a:" + a + "b:" +b);
		 staticVariableOne obj1 = new staticVariableOne();
		 staticVariableOne obj2 = new staticVariableOne();
		 obj1.a = 100;
		 obj1.b = 200;
		 System.out.println("a:" + obj1.a + "b:" +obj1.b);
		 System.out.println("a:" + obj2.a + "b:" +obj2.b);
		 obj2.a = 300;
		 obj2.b = 400;
		 System.out.println("a:" + obj1.a + "b:" +obj1.b);
		 System.out.println("a:" + obj2.a + "b:" +obj2.b);


	}

}
