/*🧩 Problem 2: Laptop Class with Two Methods
📝 Goal:

Create a Laptop class.

Use a default constructor that prints "Laptop is starting...".

Add two methods:

open() → prints "Laptop is open"

shutdown() → prints "Laptop is shutting down".
🧪 Expected Output:

Laptop is starting...
Laptop is open
Laptop is shutting down*/

package ProblemsConstructor;

public class Laptop {

	Laptop(){
		System.out.println("Laptop is starting...");
	}
	public void open() {
		System.out.println("Laptop is open");
	}
	public void shutdown() {
		System.out.println("Laptop is shutting down");
	}
	public static void main(String[] args) {
		Laptop objLap = new Laptop();
		objLap.open();
		objLap.shutdown();
	}

}
