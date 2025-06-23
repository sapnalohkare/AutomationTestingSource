package modifier.nonAccess_Modifiers.Static;

//methods belongs to the class, rather than an object
//does not need  object to call in static as well as static methods or in constructor
public class Static_Method {

	public static void main(String[] args) {

		Static_Method.details();
	}

	static void details() {
		System.out.println("static method does not need object");
	}

}

class flower {
	static {
		System.out.println("static block..");
		Static_Method.details();

	}

}
