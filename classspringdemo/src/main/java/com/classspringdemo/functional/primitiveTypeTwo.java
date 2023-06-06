package com.classspringdemo.functional;

public class primitiveTypeTwo {

	public static void main(String[] args) {
		
		Byte b = Byte.valueOf((byte)100);
		
		byte b1 = b.byteValue();
		
		System.out.println(b+"..."+b1);
		
        Long l1 = Long.valueOf((long)1000);
        
        long l2 = l1.longValue();
		
		System.out.println(l1+"..."+l2);
		
        Float f1 = Float.valueOf(100.00f);
        
        float f2 = f1.floatValue();
		
		System.out.println(f1+"..."+f2);
		
		Character c1 = Character.valueOf('c');
		
		char c2 = c1.charValue();
		
		System.out.println(c1+"..."+c2);
		
		
		

	}

}
