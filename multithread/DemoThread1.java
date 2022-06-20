package com.zensar.multithread;

public class DemoThread1 {

	public static void main(String[] args) {

		MyThread1 mt = new MyThread1();/*
										 * ye class Thread ki tarah Bhave kare to Thread class ke Constructor me Eska
										 * Refrence(Target) pass kar denge
										 */
         //thread ke constructor me bhi thread ke name set kr sakte h
		Thread t1 = new Thread(mt,"t1"); // Create Thread Class object Because Thread Class have Start() method and
		//t1.setName("t1");
		t1.setDaemon(false);
		t1.start();
		System.out.println(t1.getName());

		Thread t2 = new Thread(mt,"t2");
		//t2.setName("t2");
		t2.setDaemon(true);    // Deamon thread ko create karne ka tarika
		t2.start();
		System.out.println(t2.getName());
	}

}
