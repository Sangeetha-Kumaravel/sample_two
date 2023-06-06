package com.classspringdemo.classspringdemo;

public class nonStaticVariable {
	
	int a  = m1();

	public static void main(String[] args) {
		System.out.println( "Main Method starts");
		nonStaticVariable nsa = new nonStaticVariable();
		System.out.println( "Main Method ends");
	}

	   int m1() {
	     System.out.println( "M1 Method");
	     System.out.println(a); 
	     return 10;
	     
	}
	   {
		   System.out.println( "Non static Block");  
	   }
	   nonStaticVariable(){
		   System.out.println( "constructor");
	   }

}
