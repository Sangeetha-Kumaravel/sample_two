package com.classspringdemo.classspringdemo;

class constructorChaining {
	
	constructorChaining(){
		this (100);
		System.out.println("Zero Argument Constructor");
		
		
	}
    constructorChaining(int x){
    	this ("Ram");
		System.out.println("Int Argument Constructor");
		
	}
     constructorChaining(String s){
    	 System.out.println("String Argument Constructor");
	
   }
}

class constructorChainingTwo extends constructorChaining{ 
	 
	 constructorChainingTwo(){
	 super(102);
	 System.out.println("Int Argument Constructor2");
	 }
	 

	public static void main(String[] args) {
	  
		constructorChainingTwo cc = new constructorChainingTwo();

	}
}
 
