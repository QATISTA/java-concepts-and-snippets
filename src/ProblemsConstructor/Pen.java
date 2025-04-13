/*Problem 1: Create a Pen Class
📝 Goal: Create a class called Pen that has a default constructor which prints "A pen is created!".
Also add a method write() that prints "Writing with the pen...".

🧪 Expected Output:

A pen is created!
Writing with the pen...
*/

package ProblemsConstructor;

public class Pen {

	public Pen(){
		System.out.println("A pen is created");
	}
	
	public void write() {
		System.out.println("Writing with the pen...");
	}
	public static void main(String[] args) {		
		Pen obj1 = new Pen();
		obj1.write();
	}

}
