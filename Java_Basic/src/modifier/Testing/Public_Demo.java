package modifier.Testing;

import modifier.Access_modifiers.Public_;

public class Public_Demo {
	public void run() {
		System.out.println("Public_Demo : different package");
	}

	public static void main(String[] args) {
		/* 1) class : outside the package */
		Public_ public_Object = new Public_();
		public_Object.display();

		/* 2) method : public method access outside package */
		modifier.Method.Public object = new modifier.Method.Public();
		object.attack();

		modifier.Variable.Public localObject = new modifier.Variable.Public();
		System.out.println(localObject.a);
	}
}

//outside the package 
class Constructor_Public {
	static {

		// outside the package
		modifier.Constructor.Public object = new modifier.Constructor.Public();
		System.out.println(object);
	}

}

class Variable_Public {
	static {

		// variable access outside the package
		modifier.Variable.Public object = new modifier.Variable.Public();
		System.out.println(object);
	}

}