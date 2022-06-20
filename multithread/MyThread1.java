package com.zensar.multithread;

public class MyThread1  implements Runnable{       // create a Thread using runnable interface
	public void run() {
		if (Thread.currentThread().getName() == "t1") {
			for (int i = 0; i < 10; i++) {
				try {
					Thread.currentThread().sleep(2000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				System.out.println("Ram");
			}
		}
		if (Thread.currentThread().getName() == "t2") {
			for (int i = 0; i < 10; i++) {
				try {
					Thread.currentThread().sleep(2000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				System.out.println("Seeta");
			}
		}
	}
}
