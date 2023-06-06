package com.classspringdemo.classspringdemo;

import java.util.Scanner;


public class constructorTwo {

	
	long accNumber;
	String accName;
	
	public static void main(String[] args) {
		
		int size;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the account size");
		size = scan.nextInt();
		constructorTwo [] a = new constructorTwo[size];
		
		for(int i=0;i<a.length;i++) {
		System.out.println("Enter the" + (i+1) + " details");
		constructorTwo ct = new constructorTwo();
		System.out.println("Enter the account number");
		ct.accNumber = scan.nextLong();
		System.out.println("Enter the account name");
		ct.accName = scan.next();
		a[i]= ct;
		}
		
		for(int i=0;i<a.length;i++) {
		System.out.println("Enter the" + (i+1) + " details");
		constructorTwo ct = a[i];
	    System.out.println(ct.accNumber);
		System.out.println(ct.accName);

	}

}}
