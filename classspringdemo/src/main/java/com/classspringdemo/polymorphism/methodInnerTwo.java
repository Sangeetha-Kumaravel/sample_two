package com.classspringdemo.polymorphism;

  public class methodInnerTwo {
	  
	 private int a = 100;
	 private int a1 = 600;
	 
      void info() {
		 System.out.println("outer class method");
	 }
      
      // check the methods available at class level
	
	  void show() {
		  
		  // cannot check the methods available at method level
		  
		final  int d = 500;
		
		  for(int i = 0; i<2; i++) {
			 
			  
			  class Inner{
				 
				  int a = 10;
				  int b = 20;
				  
				  // check the methods available at class level
				  
				  public void info() {
				
					  // cannot check the methods available at method level
					  
					  int b = 20;
					  System.out.println("inner class method");
					  System.out.println(this.b);
					  System.out.println("a-total"+ a);
					  System.out.println("a1-totally Test"+ a1);
					  System.out.println("b"+ b);
					  System.out.println("d-totally Test"+ d);
					  System.out.println("a"+ methodInnerTwo.this.a); 
					  methodInnerTwo.this.info();
				  }
				  
				  
			  }
			  new Inner().info();
		  }
	  }
	

	public static void main(String[] args) {
		
		new methodInnerTwo().show();

	}

}
