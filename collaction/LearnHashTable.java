package com.zensar.collections;

import java.util.Hashtable;

import com.zensar.entitiy.Employee;

public class LearnHashTable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee emp3= new Employee(1102,"Raja",5000);
		Employee emp4 = new Employee(1101,"Sohan",1000);
		Employee emp2 = new Employee(1103,"Mohan",2000);
		Employee emp1 = new Employee(1100,"Vikash",6000);
		
		Hashtable m= new Hashtable();
		
		m.put(emp1.getEmployeedId(), emp1);
		m.put(emp2.getEmployeedId(), emp2);
		m.put(emp3.getEmployeedId(), emp3);
		System.out.println(m);
	}

}
