package InnerClasssConcept;
class Demo{
	 int a=10;
}
final class NormalInnerClass {
	private int a ;
 
	public NormalInnerClass() {
		
		System.out.println("outer constructer");
	}

	// Normal inner class
	class B{
		private int b = 20;
		
 public B() {
	a=15;
	 System.out.println("outside Constructer");
 }
		public void display() {
			System.out.println("outer class output :" + a);
			System.out.println("inner class output :" + b);
		}
	}

	public static void main(String[] args) {
		NormalInnerClass a1 = new NormalInnerClass();
		B b1 = a1.new B();
		b1.display();
		// System.out.println(a1.a); "Direct outer class ki properties access lar askte
		// hai"
			Demo d1=new Demo();
			System.out.println("Demo1 "+d1.a);
	}

}
