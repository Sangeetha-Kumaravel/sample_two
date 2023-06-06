package com.classspringdemo.classspringdemo;

public class constructorThree {

	
	long accNumber;
	String accName;
	
	constructorThree(long accNumber,String accName){
	this.accNumber = accNumber;	
	this.accName = accName;
	
	}
	
	public static void main(String[] args) {
		
		constructorThree ct1 = new constructorThree(989,"Ram");
		constructorThree ct2 = new constructorThree(990,"Sam");
		System.out.println(ct1.accNumber +"..."+ct1.accName);
		System.out.println(ct2.accNumber +"..."+ct2.accName);

	}

}
