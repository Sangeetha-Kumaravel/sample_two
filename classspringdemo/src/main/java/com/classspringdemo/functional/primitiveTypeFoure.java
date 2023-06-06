package com.classspringdemo.functional;

public class primitiveTypeFoure {

	public static void main(String[] args) {


		String s1 = String.valueOf((byte)10);
		
		
		byte b1 = Byte.parseByte(s1);
		
		System.out.println(s1+"..."+b1);
		
		String s2 = String.valueOf((long)100);
		
		long l1 = Long.parseLong(s2);
		
		System.out.println(s2+"..."+11);
		
		String s3 = String.valueOf(true);
		
		boolean bo2 = Boolean.parseBoolean(s3);
		
		System.out.println(s3+"..."+bo2);
		
		String s4 = String.valueOf('t');
		
	    System.out.println(s4);
	    
	   // char c = Character.parseCharacter(s4); //string to char ==> not allowed
		
		//AutoBoxing 1.5 Java onwards
		
		int i = 10;
		Integer i1 = 10;
		Integer i2 = i;
		
		//Auto Un Boxing 1.5 Java onwards
		
		int i3 = i1;
		
		int i4 = new Integer (200);
		
		
		
		
	
		
		

	}

}
