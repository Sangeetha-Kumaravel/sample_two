package com.classspringdemo.classspringdemo;

public class nonStaticVariableThree {
	
	   int a = 10;
	   int b = 20;

	public static void main(String[] args) {
		
		 
		 nonStaticVariableThree obj1 = new nonStaticVariableThree();
		 nonStaticVariableThree obj2 = new nonStaticVariableThree();
		 System.out.println("a:" + obj1.a + "b:" +obj1.b);
		 System.out.println("a:" + obj2.a + "b:" +obj2.b);
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
