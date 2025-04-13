/*Problem 1: Student Info
Create a class called Student with the following:
Fields: name (String), age (int)
A parameterized constructor to initialize both fields
A method displayInfo() to print the name and age
In the main method:
Create an object of Student by passing values to the constructor
Call displayInfo() to show the output*/

package ProblemsConstructor;

public class Student {
	String name;
	int age;
	Student(String n,int a){
		name=n;
		age=a;
	}
	public void displayInfo() {
		System.out.println("Student name is "+ name);
		System.out.println("Student age is "+ age);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student obj1 = new Student("John", 22);
		obj1.displayInfo();
	}

}
