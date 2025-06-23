package modifier.Access_modifiers.Default;

//default variable is accessible : with class : outside class  : within package

public class Default_Variable {
	int a = 9;
	
	public static void main(String[] args) {

		
		//within the class
		Default_Variable ob = new Default_Variable();

		System.out.println(ob.a);

	}

}

class Default_Demo_variable {

	static {
		
		// outside class and inside package
		Default_Variable ob = new Default_Variable();

		System.out.println(ob.a);
	}

}
