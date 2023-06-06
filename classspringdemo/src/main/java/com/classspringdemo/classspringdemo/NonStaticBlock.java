package com.classspringdemo.classspringdemo;

import java.util.Scanner;

public class NonStaticBlock {

	String cineName;
	int cineFee;
	// static Scanner scan = null;
	{
		System.out.println("Enter the cineName");
		Scanner scan = new Scanner(System.in);
		cineName = scan.next();
		
	}
	{
		System.out.println("Enter the cineFee");
		Scanner scan = new Scanner(System.in);
		cineFee = scan.nextInt();
		
	}
	public static void main(String[] args) {
		
		System.out.println("Main Method");
		NonStaticBlock nsb = new NonStaticBlock();
		System.out.println(nsb.cineName);
		System.out.println(nsb.cineFee);

	}

}