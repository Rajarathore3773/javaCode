package Assignment;

public class Test {

	public static void main(String[] args) {
		Employee  ob = new  Manager(101,"Raja",10000,500);
System.out.println("Calculate salary Manager : "+ob.calculateSalary());

Employee  ob1 = new  Labour(102,"Ram",50000,3);
System.out.println("Calculate salary Labour : "+ob1.calculateSalary());
	}

}
