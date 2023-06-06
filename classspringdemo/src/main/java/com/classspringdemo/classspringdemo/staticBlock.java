package com.classspringdemo.classspringdemo;

import java.util.Scanner;

public class staticBlock {

	static String cineName;
	static int cineFee;
	// static Scanner scan = null;
	static{
		System.out.println("Enter the cineName");
		Scanner scan = new Scanner(System.in);
		cineName = scan.next();
		
	}
	static{
		System.out.println("Enter the cineFee");
		Scanner scan = new Scanner(System.in);
		cineFee = scan.nextInt();
		
	}
	public static void main(String[] args) {
		
		System.out.println("Main Method");
		System.out.println(cineName);
		System.out.println(cineFee);

	}

}
