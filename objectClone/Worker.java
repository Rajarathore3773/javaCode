package com.zensar.objectClone;

public class Worker implements Cloneable {
	int rollNumber;
	String name;
	
public Worker(int rollNumber, String name) {
		
		this.rollNumber = rollNumber;
		this.name = name;
	}


public static void main(String[] args) throws CloneNotSupportedException  {
	
	
	
	
		Worker w= new Worker(101,"Ram");
		
		Worker 	w1 = (Worker) w.clone();
		w1.rollNumber=102;
		w1.name="Balram";
		System.out.println("orignal object");
		System.out.println("Name :"+w.name);
		System.out.println("rollNumber :"+w.rollNumber );
		System.out.println("----------------------------------------");
		
		System.out.println("Cloned object");
		System.out.println("Name :"+w1.name);
		System.out.println("rollNumber :"+w1.rollNumber );
	
}
}
