package com.classspringdemo.inheritance;

class grandParent {
	
	int c;
	grandParent(int c){
		this.c= c;
	}
	

}
class parentOne extends grandParent{
	
	int b;
	parentOne(int b,int c){
		super(c);
		this.b= b;
	}
	

}
class childOne extends parentOne{
	
	int a;
	childOne(int a,int b,int c){
		super(b,c);
		this.a= a;
	}
	
	void display() {
		System.out.println(a); 
		System.out.println(b);
		System.out.println(c);
	}
	

}
