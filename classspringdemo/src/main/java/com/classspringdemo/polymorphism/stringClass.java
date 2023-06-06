package com.classspringdemo.polymorphism;

public class stringClass {

	public static void main(String[] args) {


		String str1 = "sam";
		String str2 = "Sam";
		System.out.println(str1.compareTo(str2));
		
		StringBuffer str = new StringBuffer();
		
        int x= str.capacity();
        System.out.println(x);
	}

}
