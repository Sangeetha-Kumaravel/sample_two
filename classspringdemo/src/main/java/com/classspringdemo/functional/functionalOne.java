package com.classspringdemo.functional;

public class functionalOne implements Runnable{
	
	@Override
	public void run() {
	
		for(int i=0;i<5;i++) {
			
			System.out.println(Thread.currentThread().getName());
			//this.m1();
		}
	}
	
	
	public void m1() {
		
		for(int i=0;i<5;i++) {
			
			System.out.println("m1 method");
		}
	}



	public static void main(String[] args) {


		functionalOne fo1 = new functionalOne();
	 	
	      Thread t1 = new Thread(fo1);
	      t1.setName("NITE");
	      t1.start();
		//fo1.setName("NITE");
		//fo1.start();
		
		functionalOne fo2 = new functionalOne();
		
		  Thread t2 = new Thread(fo2);
		  t2.setName("KITE");
	      t2.start();
		//fo2.setName("KITE");
		//fo2.start();


		
            for(int i=0;i<5;i++) { 
			
			System.out.println(Thread.currentThread().getName());
		}
	}

}
