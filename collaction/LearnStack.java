package com.zensar.collections;

import java.util.Iterator;
import java.util.ListIterator;
import java.util.Stack;

public class LearnStack {

	public static void main(String[] args) {
		
		Stack name = new Stack();
		
		name.push("Raja");

		name.push("Ram");
		name.push("Rohit");
		//name.pop();
		
		System.out.println(name);
		System.out.println(name.peek());
		System.out.println(name.capacity());
		
	 	
		
//		System.out.println("-------------*Using iterartor*-----------------");
//		Iterator iterator = name.iterator();
//		while(iterator.hasNext()) {
//			System.out.println(iterator.next());
//			
//		}
//
//System.out.println("---------*Using ListIterartor*-----");
//		
//		// Getting ListIterator
//		ListIterator  namesIterator1 = name.listIterator();
//		
//		// Traversing elements
//		while(namesIterator1.hasNext()){
//		   System.out.println(namesIterator1.next());			
//		}	
		

	}

}
