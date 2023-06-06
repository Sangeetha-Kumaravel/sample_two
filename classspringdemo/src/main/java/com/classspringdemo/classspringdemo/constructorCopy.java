package com.classspringdemo.classspringdemo;

public class constructorCopy {
	
	int a =10;
	int b = 20;
	
	constructorCopy(){
		
	}
	
    constructorCopy(constructorCopy cc){
    	this.a = cc.a;
    	this.b = cc.b;
    
		
	}

	public static void main(String[] args) {
		
		constructorCopy cc = new constructorCopy();
		System.out.println(cc.a+"..."+cc.b);
		cc.a = 100;
		cc.b = 200;
		System.out.println(cc.a+"..."+cc.b);
		
		constructorCopy cc1 = new constructorCopy();
		System.out.println(cc1.a+"..."+cc1.b);
		
		constructorCopy cc2 = cc;
		System.out.println(cc2.a+"..."+cc2.b);
		
		constructorCopy cc3 = new constructorCopy(cc);
		System.out.println(cc3.a+"..."+cc3.b);

	}

}
