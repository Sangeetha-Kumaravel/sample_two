package com.classspringdemo.functional;

public class Test {

	
	@Override
	public void finalize() {
		
		System.out.println("FinalizeOne"+ Thread.currentThread().getName());
		System.out.println("FinalizeTwo"+ Thread.currentThread().isDaemon());
	}
	public static void main(String[] args) {


		Thread t = Thread.currentThread();
		System.out.println(t.getName()+ "...."+ t.isDaemon());
		
		functionalFive ff = new functionalFive();
		ff.setName("KITE");
		ff.setDaemon(true);
		ff.start();
		
         for(int i=0;i<5;i++) {
			
		System.out.println(Thread.currentThread().getName());
		
         }
         
		Test t1 = new Test();
		System.gc();
			
		}

	}


