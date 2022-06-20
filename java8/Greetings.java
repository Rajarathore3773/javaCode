package com.zensar.java8;

public interface Greetings {

	public void  greet(String name);
}

class Test{
	public static void main(String[] args) {
//		// inner Anonymous class
//		Greetings  greeting = new Greetings() {
//
//			@Override
//			public void greet(String name) {
//				// TODO Auto-generated method stub
//				System.out.println("Hello :"+ name);
//			}
//			
//		};
//		
//		greeting.greet("Rathore");
		
		/*Lamda expression
		 * Contain 3 thing = () -> {}; */
		
		Greetings greeting =(String name) ->{
			System.out.println("Hello: "+ name);
		};
		greeting.greet("Mohit");
	}
}



