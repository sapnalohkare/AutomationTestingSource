package modifier.Method;

//	Default method is only accessible in the same package(within class and outside the class). 

//This is used when you don't specify a modifier.

public class Default {

	// default method : accessible with in package only..
	void usename() {
		System.out.println("Username is : Granthik");

	}

	public static void main(String[] args) {
		Default object = new Default();

		// within class
		object.usename();

	}

}

class Default_Method {
	static {

		Default object = new Default();

		// outside the class
		object.usename();

	}

}
