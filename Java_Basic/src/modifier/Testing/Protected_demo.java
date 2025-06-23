package modifier.Testing;

import modifier.Method.Protected;

public class Protected_demo extends Protected {

	public static void main(String[] args) {
		Protected_demo object = new Protected_demo();

		// protected method accessed---
		object.testing();

	}

}

class Protected_Practice extends modifier.Variable.Protected {
	static {
		// outside the package with the help of inheritance
		Protected_Practice object = new Protected_Practice();
		System.out.println(object.a);

	}

}

//constructor call outside class and  outside the package with the help inheritance
class Protected_constructor extends modifier.Constructor.Protected {
	static {
		// constructor call outside class and outside the package with the help
		// inheritance

		{
			Protected_constructor object = new Protected_constructor();
			System.out.println(object);

		}

	}
}

class  Protected_Variable extends modifier.Variable.Protected
{
	 static
	 { 
		 //variable access outside the class and within the package
		 Protected_Variable object = new Protected_Variable();
		 System.out.println(object.a);
		 
	 }
	 
	 
	 
}
