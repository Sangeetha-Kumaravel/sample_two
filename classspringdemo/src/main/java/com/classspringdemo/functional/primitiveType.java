package com.classspringdemo.functional;

public class primitiveType {
	
	public static void main(String[] args) {
		
		
		Byte b1 = new Byte((byte)10);
		Byte b2 = new Byte("10");
		
		Long l1 = new Long((long)100);
		Long l2 = new Long("100"); //Annotation not allowed
		
		Float f1 = new Float(100.23f);
		Float f2 = new Float("100.23f");
		Float f3 = new Float("100.233d");
		
		Double d1 = new Double(100.234d);
		Double d2 = new Double("100.234d");
		
		Character c1 = new Character('c');
		
		Boolean bo1 = new Boolean(true);
		Boolean bo2 = new Boolean("true");
		
		System.out.println(b1+"..."+b2);
		System.out.println(l1+"..."+l2);
		System.out.println(f1+"..."+f2+"..."+f3);
		System.out.println(d1+"..."+d2);
		System.out.println(bo1+"..."+bo2);
		System.out.println(c1);
	}

}
