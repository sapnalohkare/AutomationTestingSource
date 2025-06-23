package modifier.nonAccess_Modifiers.Abstract;


//can not create object --> have concrete(Instance and static methods) , variable(static and instance)

public class Abstract_Class extends employee {

	public static void main(String[] args) {
		
		// employee obj = new employee();------error-------

		Abstract_Class object = new Abstract_Class();
		object.display();

	}

	void display() {
		super.to_String();
	}

	void to_String() {
		System.out.println("Abstract employee class..");
	}

}

abstract class employee {

	void to_String() {
		System.out.println("Abstract employee class..");
	}

}
