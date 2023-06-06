package com.classspringdemo.functional;

public class instituteOne {

	
     public static void classRoom(String FacultyName) {
    	 
    	 System.out.println("main method");
    	 synchronized(instituteOne.class) {
		
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
    	 
     }
}
