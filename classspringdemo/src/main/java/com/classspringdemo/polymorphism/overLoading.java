package com.classspringdemo.polymorphism;

public class overLoading{
	
	protected  static int f = 600;
	private  static int g = 700;
	public  static int h = 800;
	
	public static void main(String[] args) {
		
		System.out.println("Valid program"); 
		
		overLoadingOne otl = new overLoadingOne();
		
		System.out.println(otl.m1()); 
		System.out.println(otl.hashCode()); 
	}

}
