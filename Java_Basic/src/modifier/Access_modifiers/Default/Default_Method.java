package modifier.Access_modifiers.Default;

//	Default method is only accessible in the same package(within class and outside the class). 

//This is used when you don't specify a modifier.

public class Default_Method {

	// default method : accessible with in package only..
	void usename() {
		System.out.println("Username is : Granthik");

	}

	public static void main(String[] args) {
		Default_Method object = new Default_Method();

		// within class
		object.usename();

	}

}

class Default_Method_demo {
	static {

		Default_Method object = new Default_Method();

		// outside the class
		object.usename();

	}

}
