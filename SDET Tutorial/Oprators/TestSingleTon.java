package Oprators;
// Singleton class
class Shape{
	String  name;
	
	static Shape s=null;
//rule 1;- constructor ko private karna hai
	private Shape(String name){
		this.name=name;
	}
	
	public static Shape getInstance(String name) {
		if(s==null) {
			s= new Shape(name);
		}
		return s;
	}
}





public class TestSingleTon {
public static void main(String[] args) {
	Shape s=  Shape.getInstance("Raja");
	System.out.println(s.name);
	Shape s1=  Shape.getInstance("Mohit");
	System.out.println(s1.name);
	System.out.println(s.name);
}
	

}
