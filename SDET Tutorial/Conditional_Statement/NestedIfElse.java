package conditionalStatement;

public class NestedIfElse {

	public static void main(String[] args) {
		// Ager 4 ya 5  Conditions hai to "Nestes If-else" lena hai
		/*Nested if-else :- 1 me code lengthy ho jata hai to 
		 * */
		
		// Switch case = ager 4 ya 5 se Jayada confitions h to "Switch-case"  ka use karna h

		int day=0;
		
		if(day==1) {
			System.out.println("Sunday");
		}else if(day==2) 
			System.out.println("Monday");
		else if(day==3) 
			System.out.println("Tuesday");
		else if(day==4) 
			System.out.println("Wednesday");
		else if(day==5) 
			System.out.println("Thursday");
		else if(day==6) 
			System.out.println("Friday");
		else if(day==2) 
			System.out.println("Saturday");
		else
			System.out.println(" Invalid Week Number");
	}

}
