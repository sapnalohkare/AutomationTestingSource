package OOPs.Inheritance.single;

//Single Inheritance
public class B extends A{
	
	float salary = 40000.56f;

	public static void main(String[] args) {
		
		
		System.out.println("................Single Inheritance.............");
		B object = new B();
		
		System.out.println(object.a);
		object.test();
		
		System.out.println(object.salary);

	}

}
