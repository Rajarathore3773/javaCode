package com.zensar.entitiy;

public class SalesPerson extends WageEmployee{
	private int commition;

	public SalesPerson(int employeedId, String employeeName, int employeedSalary,int houre, int rate,int commition) {
		super(employeedId,employeeName, employeedSalary,houre, rate);
		this.commition = commition;
	}

	public int getCommistion() {
		return commition;
	}

	public void setCommistion(int commition) {
		this.commition = commition;
	}
	
	public int calculateSalary() {
		return super.calculateSalary()+commition;
	}
	public String toString() {
		return super.toString()+ "Commition :" +commition+ " ";
	}

}
