package com.classspringdemo.functional;

public class functionalFive extends  Thread{
	
	public void run() {
		
		Thread t = Thread.currentThread();
		System.out.println(t.getName()+ "...."+ t.isDaemon());
		
		for(int i=0;i<5;i++) {
			
			System.out.println(Thread.currentThread().getName());
			
			
			try {
				
			 
				Thread.sleep(2000);
			}
			catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

}
