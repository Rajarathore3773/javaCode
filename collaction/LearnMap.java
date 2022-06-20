package com.zensar.collections;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

import com.zensar.entitiy.Employee;

public class LearnMap {

	public static void main(String[] args) {
		Employee emp3= new Employee(1102,"Raja",5000);
		Employee emp4 = new Employee(1101,"Sohan",1000);
		Employee emp2 = new Employee(1103,"Mohan",2000);
		Employee emp1 = new Employee(1100,"Vikash",6000);
		
		Map <Integer,Employee> m= new HashMap<>();
//		m.put(1,"Raja");
//		m.put(2,"Mohan");
//		m.put(3,"Sohan");
//		m.put(4,"Raja");
//		System.out.println(m);
		m.put(emp1.getEmployeedId(), emp1);
		m.put(emp2.getEmployeedId(), emp2);
		m.put(emp3.getEmployeedId(), emp3);
		
		//m.put(emp4.getEmployeedId(), emp4);
		//System.out.println(m);
		
		//System.out.println(m.get(emp2.getEmployeedId()));
		
		System.out.println("================Using Iterartor=================");
		Set keys= m.keySet();
		Iterator iterator = keys.iterator();
		while(iterator.hasNext()) {
			Integer i = (Integer)iterator.next();
			System.out.println(m.get(i));
		}
		
		
		System.out.println("=============Using For Each Loop=============");
		for(Map.Entry <Integer,Employee>  set : m.entrySet()) {
			System.out.println(set.getKey() +" "+ set.getValue());
			
		}
		
	}
}
