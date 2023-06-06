package com.classspringdemo.functional;

public class functionalThree  extends Thread{

	
	    static Thread mt = null;
	
		@Override
		public void run() {
		
			for(int i=0;i<5;i++) {
				
				System.out.println(Thread.currentThread().getName());
				//this.m1();
				
				try {
					
					System.out.println(Thread.currentThread().getName());
				    mt.join();
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

	        mt  = Thread.currentThread();
            
            System.out.println("Main method");
			functionalThree fo1 = new functionalThree();
		 	
			fo1.setName("NITE");
			fo1.start();
			
			//fo1.join();
			// mt.join();
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
