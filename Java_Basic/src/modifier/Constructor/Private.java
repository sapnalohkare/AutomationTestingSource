package modifier.Constructor;

//Private constructor only accessible within class.

public class Private {

	private Private() {

		System.out.println("Private constructor only accessible within class...");
	}

	public static void main(String[] args) {

		Private private_Object = new Private();
		System.out.println(private_Object);

	}

}

class User {

	public static void main(String[] args) {
		// not able to create object as constructor is private
		/* Private private_Object = new Private(); */

	}

}
