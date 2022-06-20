package com.zensar.entitiy;

import java.io.Serializable;
import java.util.Comparator;

public  class Employee implements Serializable,Comparable{

	private int employeedId;
	 private String employeeName;
	 private int employeedSalary;
	 
   public Employee() {
		super();
	}
   
public Employee(int employeedId, String employeeName, int employeedSalary) {
	super();
	this.employeedId = employeedId;
	this.employeeName = employeeName;
	this.employeedSalary = employeedSalary;
}


public int getEmployeedId() {
		return employeedId;
	}
	public void setEmployeedId(int employeedId) {
		this.employeedId = employeedId;
	}
	public String getEmployeeName() {
		return employeeName;
	}
	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}
	public int getEmployeedSalary() {
		return employeedSalary;
	}
	public void setEmployeedSalary(int employeedSalary) {
		this.employeedSalary = employeedSalary;
	}
	@Override
	public String toString() {
		return "Employee [Name:"  +employeeName+ " Id: " +employeedId+ " Salary: " +employeedSalary+ "] ";
	}
	
	
 public int calculateSalary() {
	 return 0;
 }



public int compareTo(Object o) {
	 Employee e= (Employee )o;
if(this.getEmployeedId() > e.employeedId ) {
	return -1;
}
if(this.getEmployeedId() <e.employeedId  ) {
		return 1;
	}
if(this.getEmployeedId() == e.employeedId ) {
	return 0;
}
	return 123;
	
}
public static void printEmployee(String name) {
	System.out.println(name);//using this method in "Addition.java Class"
}
}
