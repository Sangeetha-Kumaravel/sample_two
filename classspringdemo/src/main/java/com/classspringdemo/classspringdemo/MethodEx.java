package com.classspringdemo.classspringdemo;

import java.util.Scanner;

public class MethodEx {

	public static void main(String[] args) {
		
		String input = "7 tea 12 coffee";
		Scanner scan = new Scanner(input).useDelimiter("\\s");
		System.out.println(scan.nextInt());
		
		System.out.println(scan.next());
		System.out.println(scan.nextInt());
		System.out.println(scan.next());

	}

}
