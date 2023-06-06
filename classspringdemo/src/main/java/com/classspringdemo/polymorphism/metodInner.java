package com.classspringdemo.polymorphism;

class metodInner {    //metodInner$inner.class
	
    private int a = 10;
    private int b = 20;
    
    void m1() {
  	  System.out.println("outer class m1 method");
  }
    void m2() {
    	  System.out.println("outer class m2 method");
    }
    
    void m3() {
  	  System.out.println("outer class m3 method");
  }
    
    metodInner(){
    	System.out.println("outer class constructor");
    }
    
    // check the methods available at class level
    
    class inner{
    	
    	 int a = 100;
         int b = 200;
         
         void m1() {
         	  System.out.println("Inner class m1 method");
         }
         
         // check the methods available at class level
         
         void m2() {
        	  System.out.println("inner class m2 method");	
        	  System.out.println(metodInner.this.a+metodInner.this.b);
        	  System.out.println(this.a+this.b);
        	  metodInner.this.m1();
        	  metodInner.this.m2();
        	  this.m1(); //m3();
        	  
        }
        
         
         
        inner(){
        	System.out.println("inner class constructor");
        }
    	
    }
	public static void main(String[] args) {
		
		metodInner mi = new metodInner();
		mi.m2();
		metodInner.inner mii = mi.new inner();
	  //metodInner.inner mi1 = new metodInner().new inner();
		mii.m2();

	}

}
