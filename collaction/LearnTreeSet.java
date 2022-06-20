package com.zensar.collections;

import java.util.Iterator;
import java.util.TreeSet;

import com.zensar.entitiy.Employee;

public class LearnTreeSet {

	public static void main(String[] args) {
		Employee e1= new Employee(101,"Raja",20000);
		Employee e2= new Employee(102,"Shyam",30000);
		Employee e3= new Employee(103,"Mohan",40000);
		
		TreeSet ts= new TreeSet(new NameComparator() );
		
		ts.add(e1);
		ts.add(e2);
		ts.add(e3);
		
		System.out.println("-------------*Using iterartor*-----------------");
		Iterator iterator = ts.iterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		
		}
	}

}
