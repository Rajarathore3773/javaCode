package InnerClasssConcept;

public class StaticInnerClass {

	private static int a = 10;

	protected static class B { // ye "class B" StaticInner class ki properety esiliye direct call kar sakte  hai 
		int b = 20;           // main method inner class ka object kr sakte hai

		public void display() {
			System.out.println("outer class :" + a);
			System.out.println("Inner class :"+b);
		}
	}


	public static void main(String[] args) {
		/*StaticInnerClass sc=new StaticInnerClass(); 
		B  b=sc. new B();
		Rule:- 1) jab inner class static na ho to ye process follow karna h
		*/
		B  b= new B();/*jab inner class static ho to direct inner class ka object create kar sakte h
		                */
		  b.display();
	}

}
