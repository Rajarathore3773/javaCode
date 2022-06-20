package com.zensar.collections;

import java.util.*;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class LearnArraylist {

	public static void main(String[] args) {
		ArrayList cities = new ArrayList();
		cities.add("Pune");
		cities.add("Hyd");
		cities.add("Banglore");

		ArrayList name = new ArrayList(cities);
		
		name.add("Raja");

		name.add("Ram");
		name.add("Rohit");
		
		
		//name.clear();
		               /*
						 * Removes all of the elements from this list. The list willbe empty after this
						 * call returns.
						 * 
						 * Specified by: clear() in List, Overrides: clear() in AbstractList
						 */

		System.out.println(cities);
		System.out.println("---------*Using Iterartor*-----");

		
		  Iterator nameIterator = name.iterator(); 
		  while (nameIterator.hasNext()) { //
		  System.out.println( nameIterator.next()); // one type
		  
		  String string = (String) nameIterator.next(); // second type
		  System.out.println(string);
		  
		 }
		 

		System.out.println("---------*Using ListIterartor*-----");
		
		// Getting ListIterator
		ListIterator  namesIterator1 = name.listIterator();
		
		// Traversing elements
		while(namesIterator1.hasNext()){
		   System.out.println(namesIterator1.next());			
		}	
		// name.add(name); //
		System.out.println("===================================================");
		System.out.println("-------------*Using For loop for travels*------------");

		for (int i = 0; i < name.size(); i++) {
			System.out.println(name.get(i));
		}

		System.out.println("===================================================");
		System.out.println("Using enhance for loop");
		for (Object names : name) {
			System.out.println((String) names);
		}

	}
}
