package com.zensar.entitiy;

public class WageEmployee extends Employee {

	private int houre;
	
	private int rate;

	public WageEmployee(int employeedId, String employeeName, int employeedSalary,int houre, int rate) {
		super(employeedId,employeeName,employeedSalary);
		this.houre = houre;
		this.rate = rate;
	}

	public int getHoure() {
		return houre;
	}

	public void setHoure(int houre) {
		this.houre = houre;
	}

	public int getRate() {
		return rate;
	}

	public void setRate(int rate) {
		this.rate = rate;
	}
	public int calculateSalary() {
		return houre*rate;
	} 
	public String toString() {
		return super.toString()+ "Rate:" +rate+ " Houre:" +houre+ " ";
	}

}
