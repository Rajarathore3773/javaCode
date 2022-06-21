package StringConcept;

public class String_Methods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s = "Welcome";

		String s1 = "To Java";
		System.out.println("Length of string :" + s.length());
		System.out.println("Joining of Two strings :" + s.concat(s1));

		// Triming ; removing the only spaces beging and end not middle space remove
		String s3 = "          Wel come   ";
		System.out.println("Before triming string is :" + s3);
		System.out.println("After triming string is :" + s3.trim());

		// charAt
		s = "Welcome";
		System.out.println("persent char on Index numbe 3 :"+s.charAt(3)); // returns character based on index number, index will be start from 0

		// contains
		s = "welcome";
		System.out.println(s.contains("Raj"));// false :- Raj is not present in welcome string
		System.out.println(s.contains("Wel")); // false ;- same character is not persent
		System.out.println(s.contains("wel")); //true :- same character is persent in string
		System.out.println(s.contains("come"));// true
		
		System.out.println("=======Comparing two string============");
		// comparing two string
		s = "welCome";
		//s1 = "Welcome";
		
		System.out.println("Diffrent content :"+s.equals("Welcome"));  // false ;- content are not same
		System.out.println("Same content :"+s.equals("welCome")); // true
		System.out.println("Diffrent content :"+s.equals(" welCome ")); // false
		System.out.println("Diffrent content but ignore case senstive only character compare:"+s.equalsIgnoreCase("Welcome")); // true
		// sapce ko bhi character me count karti  hai esiliye false diya
		System.out.println("Diffrent content but ignore case-senstive case only character compare:"+s.equalsIgnoreCase(" Welcome ")); // false
		
		//replace -> there are two ways 1. replce  char by char and 
		                              //  2. replace string to string
		
		String s2= "Raja";
		System.out.println("Replace char by char  :"+s2.replace('a', '@'));
		
		System.out.println("Replace String by String  :"+s2.replace("Raja", "Baja"));
		
		//1.subString(Begning index), 2.SubString(Starting index , Ending index); 3.SubString(Begin index , Ending index);
	/*	starting index Start with Zero-->	0	1	2	3	4	5	6	
		
		String 	------------>				w	e	l	c	o	m	e
		
		Ending index Start with one-->		1	2	3	4	5	6	7           */
		System.out.println("===========Calling all subString method========");
		String s4="Welcome";
		System.out.println("subString(Begning index) :"+s4.substring(1));//output ; e	l	c	o	m	e
		System.out.println("SubString(Starting index , Ending index):"+s4.substring(2, 5)); //
		System.out.println("SubString(Beging index , Ending index)"+s4.subSequence(1, 3));
		
		System.out.println("===========Calling  toLoverCase and ToUpperCase method========");
		String s6 = "heLLo WorLd"; // mix case String
		System.out.println("String convert into all small letter :"+s6.toLowerCase());
		System.out.println("String convert into all Capital letter :"+s6.toUpperCase());
	
		
	}

}
