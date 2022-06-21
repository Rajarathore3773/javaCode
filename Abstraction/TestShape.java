package Abstraction;

abstract class Shape {

	abstract double area();
	 Shape(){
		System.out.println("Inside shape"); 
	 }
}

class Rectangle extends Shape {
	private int height;
	private int width;

	Rectangle(int h, int w) {
		this.height = h;
		this.width = w;
	}

	double area() {
		return height * width;
	}
}

class Circle extends Shape {
	private int radius;
	private double pi = 3.14;

	Circle(int r) {
		this.radius = r;
	}

	double area() {
		return pi * (radius * radius);
	}
}

public class TestShape {
	public static void printArea(Shape o) {
		System.out.println(o.area());
	}
	public static void main(String[] args) {
		/*Shape s[] = new Shape[3];

		s[0] = new Circle(5);
		s[1] = new Rectangle(5, 3);
		s[2] = new Circle(3);
		for (Shape ss : s) {
			System.out.println(ss.area());
		}
*/	
		Rectangle r= new Rectangle(4,4);
		Circle c2= new Circle(2);
		printArea(r);
//		System.out.println("Area of Recatangle"+r.area());
//		System.out.println("Area of circle"+c2.area());
	}

}