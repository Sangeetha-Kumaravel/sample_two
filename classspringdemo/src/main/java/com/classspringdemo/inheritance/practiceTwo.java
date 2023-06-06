package com.classspringdemo.inheritance;

public class practiceTwo {
	
	static int eid; //10
	static
	{
		eid = 10;
		System.out.println("eid" + eid);
	}
   
	
	static void assign()
	{
		eid = 20;
	}
	
	static void disp() {
		
		 System.out.println(eid);
	}
	public static void main(String[] args) {
	
		practiceTwo po1 = new practiceTwo();
		po1.assign();
		po1.disp();
		

	}

}
