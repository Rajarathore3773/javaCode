package com.zensar.multithread;

public class TestSynchronization {

	public static void main(String[] args) {

		Greeting greeting = new Greeting();

		MyThread ramThtread = new MyThread(greeting, "Ram");
		MyThread seetaThtread = new MyThread(greeting, "Seeta");

		Thread t1 = new Thread(ramThtread);
		Thread t2 = new Thread(seetaThtread);

		t1.start();
		t2.start();
	}

}
