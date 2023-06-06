package com.classspringdemo.inheritance;

class DemoOne {
	
	static int a = m1();
	static int m1() {
		System.out.println("super class static m1 method"); 
		return 100;
	}
	static {
		System.out.println("super class static block"); 
		
	}
	int b = m2();
	int m2() {
		System.out.println("super class non static m2 method"); 
		return 200;
	}
	 {
		System.out.println("super class non static block"); 
		
	}

	public static void main(String[] args) {
		
		System.out.println("super class main method"); 
	}

}

class DemoTwo extends DemoOne {
	
	static int c = m3();
	static int m3() {
		System.out.println("sub class static m3 method"); 
		return 300;
	}
	static {
		System.out.println("sub class static block"); 
		
	}
	int b = m4();
	int m4() {
		System.out.println("sub class non static m4 method"); 
		return 400;
	}
	 {
		System.out.println("sub class non static block"); 
		
	}

	public static void main(String[] args) {
		
		System.out.println("sub class main method"); 
		/* DemoTwo dt = new DemoTwo(); */
		
	}

}

