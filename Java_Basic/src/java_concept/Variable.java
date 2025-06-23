package java_concept;

public class Variable {

	static String staticVariable = "SAPNA LOHKARE"; // static variable
	int instanceVariable = 100;// Instance variable

	public static void main(String[] args) {
		// accessing instance variable/instance method needs instance/object to get call
		// in static method
		Variable variableObject = new Variable();// object creation for calling instance variable and instance method
		variableObject.insatanceMethod();

		// calling static method
		/********* Variable.staticMethod();******1st way ***/
		staticMethod();/********* 2nd way ******************/

	}

	// this is instance method
	public void insatanceMethod() {
		boolean localVarible = true; // local variables accessibility is restricted to that method only
		instanceVariable = 80; // Instance method can directly call instance variable
		System.out.println("In Instance method---->" + "\n" + "Local Variable value-->:" + localVarible);
		System.out.println("Instance variable value-->" + instanceVariable);
		System.out.println("Static variable value-->" + staticVariable);
	}

	// this is static method
	public static void staticMethod() {
		Variable variableObject = new Variable();
		System.out.println("\n" + "In static method---->" + "\n" + "static Variable value-->:" + staticVariable);
		System.out.println("Instance variable value-->" + variableObject.instanceVariable);// Instance variable need
																							// object to call

	}

}
