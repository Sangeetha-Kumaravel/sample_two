package com.classspringdemo.classspringdemo;

public class constructorFive {
	
	int sid;
	String  sname;
	double sfee;

	
	constructorFive (){
		System.out.println("Zero Argument Constructor");
	}
	
	constructorFive (int sid){
		this.sid =sid;
		System.out.println("Int Argument Constructor");
	}
	
	constructorFive (String  sname){
		this.sname = sname;
		System.out.println("String Argument Constructor");
	}
	
	constructorFive (double sfee){
		this.sfee = sfee;
		System.out.println("double Argument Constructor");
	}
	
	constructorFive (int sid, String  sname,double sfee){
		this.sid =sid;
		this.sname = sname;
		this.sfee = sfee;
		System.out.println("Constructor");
	}
	
	public static void main(String[] args) {
		 
		constructorFive cf = new constructorFive();
		System.out.println(cf.sid+"..."+cf.sname+"..."+ cf.sfee);
		
		constructorFive cf1 = new constructorFive(101);
		System.out.println(cf1.sid+"..."+cf1.sname+"..."+ cf1.sfee);
		
		constructorFive cf2 = new constructorFive("Ram");
		System.out.println(cf2.sid+"..."+cf2.sname+"..."+ cf2.sfee);
		
		constructorFive cf3 = new constructorFive(1000.00);
		System.out.println(cf3.sid+"..."+cf3.sname+"..."+ cf3.sfee);
		
		constructorFive cf4 = new constructorFive(102, "Sam", 2000.00);
		System.out.println(cf4.sid+"..."+cf4.sname+"..."+ cf4.sfee);

	}

}
