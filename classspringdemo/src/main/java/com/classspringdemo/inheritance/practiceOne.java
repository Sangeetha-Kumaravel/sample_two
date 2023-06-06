package com.classspringdemo.inheritance;

public class practiceOne {
	
	int eid;
	{
		eid = 10; //this.eid = 10;
	}
	
	practiceOne(){
		
		eid = 20; 
	}
	
	void assign() {
		
		eid = 30;
		System.out.println("assign method");
	}
	
   void display() {
	   
	   System.out.println(eid);
	
   }
	public static void main(String[] args) {
		
		practiceOne po = new practiceOne();
		po.assign();
		po.display();
		

	}



}
