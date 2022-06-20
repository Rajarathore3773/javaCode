package com.zensar.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.PriorityQueue;

import com.zensar.entitiy.Employee;

public class SortArrayList {
	
	
	public static void main(String[] args) {
		Employee emp3= new Employee(1102,"Raja",5000);
		Employee emp4 = new Employee(1101,"Sohan",1000);
		Employee emp2 = new Employee(1103,"Mohan",2000);
		Employee emp1 = new Employee(1100,"Vikash",6000);

		ArrayList <Employee>al = new ArrayList<Employee>();

		al.add(emp1);
		al.add(emp2);
		al.add(emp3);
		al.add(emp4);
		//al.add(5);

//	 System.out.println("Sort arraylist in  Asecending order");
//	 Collections.sort(al);
//	 System.out.println(al);
//	 

//	 System.out.println("Sort arraylist in  Decending order");
//	 Collections.sort(al,Collections.reverseOrder());
//	 System.out.println(al);
		
		System.out.println(" Sorting by Name");
		Collections.sort(al,new NameComparator());
		System.out.println(al);
		
		System.out.println("sorting by Salary");
		Collections.sort(al,new SalaryComparator());
        System.out.println(al);
        
        
      


	}
}
