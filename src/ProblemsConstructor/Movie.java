/*Problem 3: Movie Class with Multiple Objects
📝 Goal:

Create a Movie class with a default constructor that prints "New movie added to library!".

In your main() method, create 3 different movie objects to test the constructor.

🧪 Expected Output:

New movie added to library!
New movie added to library!
New movie added to library!*/

package ProblemsConstructor;

public class Movie {
	Movie(){
		System.out.println("New movie added to library!");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Movie obj1 = new Movie();
		Movie obj2 = new Movie();
		Movie obj3 = new Movie();
	}

}
