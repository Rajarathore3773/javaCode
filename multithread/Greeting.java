package com.zensar.multithread;

public class Greeting {

	public synchronized void greet(String name) {
		for (int i = 0; i < 10; i++) {
			try {
				Thread.currentThread().sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("Hello" + name);
		}
	}
}
