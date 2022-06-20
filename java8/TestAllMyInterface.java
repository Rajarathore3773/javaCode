package com.zensar.java8;

public class TestAllMyInterface implements MyInterface1,MyInterface2 {

	@Override
	public void area() {
		// TODO Auto-generated method stub
		
	}

	public void display() {
		System.out.println("my Own implementation");
		MyInterface1.super.display();
	
	MyInterface2.super.display();
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TestAllMyInterface t= new TestAllMyInterface();
		t.display();
	}


}
