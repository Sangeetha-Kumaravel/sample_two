package com.classspringdemo.classspringdemo;

public class nonStaticVariableTwo {

	int a  = m1();

	public static void main(String[] args) {
		System.out.println( "Main Method starts");
		nonStaticVariableTwo nsat = new nonStaticVariableTwo();
		System.out.println(nsat.a);
		System.out.println(new nonStaticVariableTwo().a);
		System.out.println( "Main Method ends");
	}

	   int m1() {
	     System.out.println( "M1 Method");
	     System.out.println(a); 
	     return 10;
	     
	}
	   {
		   System.out.println( "Non static Block");  
		   System.out.println("Non static Block"+ a); 
	   }
	   nonStaticVariableTwo(){
		   System.out.println( "constructor");
	   }

}
