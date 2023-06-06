package com.classspringdemo.inheritance;

class parent {
         
	parent()
	{
		System.out.println( "parent class constrctor 1");
	}
	
	
	
	  parent(int a) {
	  
	 System.out.println( "parent class constrctor 2"); }
	 
	 	 
}
class child extends parent{
	
	
	  child(){ 
		  
		 this(100); 
		 System.out.println( "sub class constrctor 1");
	  
	  }
	 
   
	
	  child(int a){ 
		  super();
		  System.out.println( "sub class constrctor 2");
	  
	  }


}
