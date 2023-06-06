package com.classspringdemo.polymorphism;

class overLoadingTwo {

	Object m1() {
		
		return new Object();
	}

	
}

class overLoadingOne extends overLoadingTwo{


	String m1() {
		
		return new String("Sangee");
	}

	
}

