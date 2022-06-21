package looping;

public class Jumping_Statement {

	public static void main(String[] args) {
		/* if conditon jha true hogi ,vha "break statement" execute ho jayega  or loop k bahar controller aa jayega  */
		System.out.println("====using * break  statement *==========");
		for(int i=1; i<=10; i++) {
			if(i==5) {
				break ;
			}
			System.out.println(i); // output 1 2 3 4
		}
		
		
		/* if conditon jha true hogi ,vha "Continue  statement" execute ho jayega  or vo number skipe kar dega  */
		System.out.println("====using * Continue statement *==========");
		for(int i=1; i<=10; i++) {
			if(i==5) {
				continue ;
			}
			System.out.println(i); // output 1 2 3 4 (skipe -> 5) 6 7 8 9 10
		}
		
		/* if conditon jha true hogi ,vha "Continue  statement" execute ho jayega  or vo number skipe kar dega  */
		System.out.println("====using * Continue statement *==========");
		for(int i=1; i<=10; i++) {
			if(i==3 || i==5 || i==7) {// skip three value
				 // jab i==3 milega tab vo value ko skip kr next number  4 par jump ho jayega 
				 // jab i==5 milega tab vo value ko skip kr next number  6 par jump ho jayega 
				 // jab i==7 milega tab vo value ko skip kr next number  8 par jump ho jayega 
				
				continue ;
			}
			System.out.println(i); // output 1 2 (skipe -> 3) 4 (skipe -> 5) 6 (skipe -> 7)8 9 10
		}
		
	}

}
