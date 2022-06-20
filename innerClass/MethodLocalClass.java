package InnerClasssConcept;

 class MethodLocalClass {

	protected int a=10;
	// method local inner class ; method ke ander ineer class
	public void display() {
		
		class B {
			protected int b=20;
			
			public void display() {
				System.out.println("Outer class output : "+a);
				System.out.println("Inner class output:"+b);
			}   
			//MLIC = Method Local Inner Class
		}		
		/*1. Ager koi class me , method ke under  class hai ,To usse  MLIC kehte hai.
		 2. ess MLIC  ki properties ko Access karna hai to  ussi method ke under ,
		 MLIC ka object create kar ke properties ko access kar sakte hai*/
		
		B b= new B();
		b.display();
	}
	
	

	public static void main(String[] args) {
		// outer class object
		MethodLocalClass a= new MethodLocalClass();
		a.display();
	}
	
}
