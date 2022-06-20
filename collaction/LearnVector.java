package com.zensar.collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Vector;

public class LearnVector {

	public static void main(String[] args) {
		Vector name = new Vector();

		name.add("Raja");

		name.add("Ram");
		name.add("Rohit");

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
