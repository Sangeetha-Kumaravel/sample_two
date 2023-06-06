package com.classspringdemo.functional;

public class primitiveTypeThree {

	public static void main(String[] args) {
		
		Byte b1 = Byte.valueOf("100");
		
		String s1 = b1.toString();
		
		System.out.println(b1+"..."+s1);
		
		Long l1 = Long.valueOf("1000");
		
		String s2 = l1.toString();
		
		System.out.println(l1+"..."+s2);
		
		Float f1 =  Float.valueOf("100.00f");
		
		String s3 = f1.toString();
		
		System.out.println(f1+"..."+s3);
		
		Double d1 = Double.valueOf("1000.000d");
		
		String s4 = d1.toString();
		
		System.out.println(d1+"..."+s4);
		
		//Character co1 = Character.valueOf("t"); //string to char ==> not allowed
		
		Boolean bo1 = Boolean.valueOf("true");
		
		String s5 = bo1.toString();
		
		System.out.println(bo1+"..."+s5);
		
	}

}
