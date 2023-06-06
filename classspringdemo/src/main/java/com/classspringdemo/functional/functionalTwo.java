package com.classspringdemo.functional;

public class functionalTwo extends Thread{


	@Override
	public void run() {
	
		for(int i=0;i<5;i++) {
			
			System.out.println(Thread.currentThread().getName());
			
			
			try {
				System.out.println(Thread.currentThread().getName());
				Thread.sleep(2000);
			}
			catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	
	
	public void m1() {
		
		try {
			System.out.println(Thread.currentThread().getName());
			Thread.sleep(2000);
		}
		catch(InterruptedException e) {
			e.printStackTrace();
		}
	}



	public static void main(String[] args) throws InterruptedException {


		functionalTwo fo1 = new functionalTwo();
	 	
		fo1.setName("NITE");
		fo1.start();
		
		fo1.join();
		
		/*
		 * functionalTwo fo2 = new functionalTwo();
		 * 
		 * 
		 * 
		 * fo2.setName("KITE"); fo2.start();
		 */


		
            for(int i=0;i<5;i++) {
			
			System.out.println(Thread.currentThread().getName());
		}
	}

}
