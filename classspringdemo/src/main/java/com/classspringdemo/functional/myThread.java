package com.classspringdemo.functional;

public class myThread extends Thread{
	
	
	institute ins;
	//instituteOne ins;
	String facultyName;
	
	@Override
	public void run() {
		
		ins.classRoom(facultyName);
		ins.exam();
		ins.examTwo();
		
	}
	
	myThread(institute ins, String facultyName){
		
		this.ins = ins;
		this.facultyName =facultyName;
	}
	
	public static void main (String [] args) {
		
		
		institute ins = new institute();
		//instituteOne ins1 = new instituteOne();`
		//instituteOne ins2 = new instituteOne();
		myThread mt1 = new myThread(ins,"Ram");
		myThread mt2 = new myThread(ins,"Sam");
		
		mt1.start();
		mt2.start();
		//ins.exam();
		
	}
	
}