package com.classspringdemo.classspringdemo;

public class constructorOne {
	
	long accNumber = 1000;
	String accName = "Ram";

	public static void main(String[] args) {
		
		constructorOne co1 = new constructorOne();
		constructorOne co2 = new constructorOne();
		System.out.println(co1.accNumber + "..." + co1.accName);
		System.out.println(co2.accNumber + "..." + co2.accName);

	}

}
