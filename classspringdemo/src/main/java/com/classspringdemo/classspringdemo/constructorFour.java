package com.classspringdemo.classspringdemo;

import java.util.Scanner;

public class constructorFour {

	
	long accNumber;
	String accName;
	
	constructorFour(long accNumber,String accName){
	this.accNumber = accNumber;	
	this.accName = accName;
	
	}
	public static void main(String[] args) {
		int size;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the account size");
		size = scan.nextInt();
		constructorFour [] a = new constructorFour[size];
		
		for(int i=0;i<a.length;i++) {
		System.out.println("Enter the" + (i+1) + " details");
		System.out.println("Enter the account number");
		long accNumber = scan.nextLong();
		System.out.println("Enter the account name");
		String accName = scan.next();
		constructorFour ct = new constructorFour(accNumber,accName);
		a[i]= ct;
		}
		
		for(int i=0;i<a.length;i++) {
		System.out.println("Enter the" + (i+1) + " details");
		constructorFour ct = a[i];
	    System.out.println(ct.accNumber);
		System.out.println(ct.accName);

	}

	}

}
