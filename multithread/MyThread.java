package com.zensar.multithread;

public class MyThread extends Thread {

//	public void run() {
//		if (Thread.currentThread().getName() == "t1") {
//			for (int i = 0; i < 10; i++) {
//				System.out.println("Ram");
//			}
//		}
//		if (Thread.currentThread().getName() == "t2") {
//			for (int i = 0; i < 10; i++) {
//				System.out.println("Seeta");
//			}
//		}
//	}

	
	
	Greeting greeting =null;
	String name=null;
	
	public MyThread(Greeting greeting, String name) {
		
		this.greeting = greeting;
		this.name = name;
	}

	@Override
	public void run() {
		greeting.greet(name);
	}
}
