package conditionalStatement;

public class Switch_Case {
	// syntax 
	/*switch(expression -> is a variable) {
	case <Condition 1> : statements; break;
	case <Condition 2> : statements; break;
	case <Condition 3> : statements; break;
	:
    :	
    default : Statements;  // break is not required for default case
    } */
			
	
	public static void main(String[] args) {
		int day = 3;
		switch(day) { // expression
		case 1: System.out.println("Sunday"); break;
		case 2: System.out.println("Monday"); break;
		case 3: System.out.println("Tuesday"); break;
		case 4: System.out.println("Wednesday"); break;
		case 5: System.out.println("Thursday"); break;
	    case 6: System.out.println("Friday"); break;
	    case 7: System.out.println("Saturday"); break;
		
		default : System.out.println("Invalid week day");
		
		}

	}

}
