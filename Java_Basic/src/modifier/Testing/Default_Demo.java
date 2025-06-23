package modifier.Testing;

import modifier.Method.Default;

class Default_Demo {

	public static void main(String[] args) {
		// not able to create object
		/* Default default_object = new Default(); */

		// for constructor ---
		// not able to create default object as constructor is default
		/* modifier.Constructor.Default object = new modifier.Constructor.Default(); */
	}

}

class Default_Method 
{
	static {

		modifier.Method.Default object = new modifier.Method.Default();
		System.out.println(object);

		// outside the package not supported
		/* object.usename(); */ // error

	}

}
