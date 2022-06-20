package com.zensar.collections;

import java.util.Comparator;

import com.zensar.entitiy.Employee;

public class SalaryComparator implements Comparator {

	@Override
	public int compare(Object o1, Object o2) {
		Employee e1= (Employee)o1;
		Employee e2= (Employee)o2;
		
		 if(e1.getEmployeedSalary() >e2.getEmployeedSalary() ) {
			 	return 1;
			 }
			 if(e1.getEmployeedSalary() < e2.getEmployeedSalary()  ) {
			 		return -1;
			 	}
			 if(e1.getEmployeedSalary()==e2.getEmployeedSalary()) {
			 	return 0;
			 }
			return 123;
		//return (e1.getEmployeedSalary().compareTo(e2.getEmployeedSalary() ));
		
	}

	
}
