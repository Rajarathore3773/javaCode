package com.zensar.collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;

public class UsingArraylistMethod {

	public static void main(String[] args) {
		ArrayList<Object> al = new ArrayList<>();

		
		al.add("Mohan");
		al.add("Sohan");
		al.add("Raja");
		al.add("Gajju");
		System.out.println(al);
		System.out.println(al.contains("Sunil"));// Object persent hai  to : true ya false
		/*
		 * System.out.println("Index by get alement : " + al.get(1));
		 * System.out.println(al.get(2));//
		 * 
		 * System.out.println("maintain insertipn order:" + al);
		 * 
		 * // printing the unsorted ArrayList System.out.println("Before Sorting :" +
		 * al);
		 * 
		 * // Sorting ArrayList in ascending Order Collections.sort(al); // printing the
		 * sorted ArrayList System.out.println("After Sorting :" + al);
		 * 
		 * Collections.sort(al, Collections.reverseOrder());
		 * System.out.println("Reverse Arraylist in decendiung order :" + al);
		 * 
		 * // Iterating arraylist using "For - Each loop"
		 * System.out.println("\"Iterate Arralist using for each loop :\""); for (Object
		 * s : al) { System.out.println(s); }
		 * System.out.println("=========Using Iterator============"); Iterator iterator
		 * = al.iterator(); while (iterator.hasNext()) {
		 * System.out.println(iterator.next()); }
		 */
	}
}
