package com.zensar.java8;

public interface MyInterface1 {

	public void area();
	
	public default void  display() {
		System.out.println("MyinetrFace1");
	}
}
