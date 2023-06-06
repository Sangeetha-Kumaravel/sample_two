package com.classspringdemo.functional;

public class institute {
	
	synchronized public void classRoom(String FacultyName) {
		
		for(int i=0;i<5;i++) {
			
			System.out.println("class taken by "+FacultyName);
			try {
				
			
				Thread.sleep(2000);
			}
			catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
    
	
	  synchronized public void exam() {
		
		for(int i=0;i<5;i++) {
			
			System.out.println("exam method");
			try {
				
			
				Thread.sleep(2000);
			}
			catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	 

	 public void examTwo() {
		
		for(int i=0;i<5;i++) {
			
			System.out.println("exam method Two");
			try {
				
			
				Thread.sleep(2000);
			}
			catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
