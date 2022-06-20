package com.zensar.test;

import com.zensar.entitiy.Employee;
import com.zensar.entitiy.SalesPerson;
import com.zensar.entitiy.WageEmployee;

public class Client {
	public static void main(String []arg) {
		
		Employee emp = new Employee(1101,"Raja",5000);
		System.out.println(emp);
		
		//polymorphism
		Employee we= new SalesPerson(1102,"mohit",5030,8,100,600);
		System.out.println(we);
		
		SalesPerson sp=new SalesPerson(1103,"gajju",5002,8,100,50);
		System.out.println(we.calculateSalary());
		System.out.println(sp);
		
	}
	
}

