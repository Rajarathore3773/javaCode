package Assignment;

public class Labour extends Employee{
	private int LabourOverTime;

	public Labour(int employeeId, String employeeName, int employeeSalary,int labourOverTime) {
		super( employeeId,  employeeName, employeeSalary);
		LabourOverTime = labourOverTime;
	}

	public int getLabourOverTime() {
		return LabourOverTime;
	}

	public void setLabourOverTime(int labourOverTime) {
		LabourOverTime = labourOverTime;
	}

	@Override
	public String toString() {
		return "Labour [LabourOverTime=" + LabourOverTime + "]";
	}
	public int calculateSalary() {
		 return  super.getEmployeeSalary()+ (LabourOverTime*100);
	 }
	
}
