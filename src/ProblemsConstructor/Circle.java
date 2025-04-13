/*🧩 Problem 4: Circle Area
Create a class called Circle with:
Field: radius (double)
A parameterized constructor that accepts the radius
A method calculateArea() that prints the area (use formula: 3.14 * radius * radius)
In the main method:
Create two Circle objects with different radius values
Call calculateArea() for both*/


package ProblemsConstructor;

public class Circle {
	double radius;
	Circle(double r){
		radius=r;
	}
	public void calculateArea() {
		System.out.println("Area of the circle is "+ 3.14 * radius * radius);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Circle obj1=new Circle(4);
		obj1.calculateArea();
		
		Circle obj2=new Circle(2);
		obj2.calculateArea();
	}

}
