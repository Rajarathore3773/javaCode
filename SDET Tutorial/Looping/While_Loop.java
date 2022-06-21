package looping;

//Note :- Ager hamare pass exact limit nhi h to  vha "while  or Do_while" loop ka use karnege

class While_Loop {
 // syntax
	
	/* initialization
	while(condition) {
		// statement
		// increment & decrement
	}
	*/
	public static void main(String[] args) {

		int i = 1;
		System.out.println("=========Print in Acending oredr==========");
		while (i <= 10) {
			System.out.println(i);
			i++;
		}
//		
		// print evem number
		System.out.println("=========Print even number==========");
		int j=2;
		while (j <= 10) {
			System.out.println(j);
			j =j+2;
		}
		
		System.out.println("=========Print in decending oredr==========");
		int z=10;
		while (z>=0) {
			System.out.println(z);
			z--;
		}
	}

}
