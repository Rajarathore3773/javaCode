package com.zensar.collections;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class LearnLinkedList {

	public static void main(String[] args) {
		
		LinkedList name = new LinkedList();
		name.add("Raja");

		name.add("Ram");
		name.add("Rohit");
		//name.pop();
		
		
		
		System.out.println("-------------*Using iterartor*-----------------");
		Iterator iterator = name.iterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next());

		}

		System.out.println("---------*Using ListIterartor*-----");

		// Getting ListIterator
		ListIterator namesIterator1 = name.listIterator();

		// Traversing elements
		while (namesIterator1.hasNext()) {
			System.out.println(namesIterator1.next());
		}

   
	}

}
