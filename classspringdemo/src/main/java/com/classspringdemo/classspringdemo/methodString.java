package com.classspringdemo.classspringdemo;

import java.util.*;

public class methodString {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the int value"); 
		int age = s.nextInt();
		methodString ms = new methodString();
		String s1 = ms.m1(age);
		System.out.println(s1); 
		
				

	}

	 String m1(int x) {


		System.out.println("string method"); 
		return "String value";
	}

}
