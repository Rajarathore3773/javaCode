package Oprators;

public class OperatorsUses {

	public static void main(String[] args) {

		int a = 10;
		int b = 20;
		System.out.println("Swap Two numbers");
		int temp =a;
		a=b;
		b=temp;
		System.out.println(a + b);

		// Arithmetic operators (+ - * / %)
		System.out.println("========Arithmetic Operatior ==========");
		System.out.println(a + b);
		System.out.println(a - b);
		System.out.println(a * b);
		System.out.println(a / b);
		System.out.println(a % b);

		// Realational operator (Comparison Operators) ---------> " 1 == 2 < 2 > 4 <= 4
		// >= 6 != "
		// Always Returns boolean value
		System.out.println(a == b);
		System.out.println(a > b);
		System.out.println(a < b);
		System.out.println(a >= b);
		System.out.println(a <= b);
		System.out.println(a != b);

		// Logical operators ( && || !)
		/* this operators works between two boolean value */
		System.out.println("========Logical Operatior ==========");

		boolean x = true;
		boolean y = false;

		System.out.println(x && y); // Dono statement true ho tb true dega
		System.out.println(x || y); // Dono statement me se koi ek true ho ,Tab true dega

		System.out.println(!x); // complement dega statement ka
		System.out.println(!y);

		// Increment & Decrement Oprator (++ --)
		System.out.println("=============Increment & Decrement Oprator================");
		int a1 = 10;       // AssignMent Oprators
		++a1; // a=a+1;
		System.out.println(a++);

		int b1 = 20;
		b1--; // b= b1-1;
		System.out.println(--b);
		
		

	}

}
