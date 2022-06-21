package Assignment;

public class Manager extends Employee{
	private int incentive;

	public Manager(int employeeId, String employeeName, int employeeSalary,int incentive) {
		super( employeeId,  employeeName,  employeeSalary);
		this.incentive = incentive;
	}
	
	public int getIncentive() {
		return incentive;
	}

	public void setIncentive(int incentive) {
		this.incentive = incentive;
	}

	@Override
	public String toString() {
		return "Manager [incentive=" + incentive + "]";
	}
	public int calculateSalary() {
		 return super.getEmployeeSalary()+incentive;
	 }

}
