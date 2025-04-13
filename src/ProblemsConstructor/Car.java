/*🧩 Problem 5: Car Details
Create a class called Car with:
Fields: brand (String), year (int)
A parameterized constructor to initialize these
A method showDetails() to print the brand and year
In the main method:
Create two car objects with different values
Call showDetails() for both*/


package ProblemsConstructor;

public class Car {
	String brand;
	int year;
	
	Car(String b,int y){
		brand=b;
		year=y;
	}

	public void showDetails() {
		System.out.println("The brand of the car is "+brand+" and in the year "+year+", it is purchased!");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car obj1=new Car("Hyundai",2022);
		obj1.showDetails();
	}

}
