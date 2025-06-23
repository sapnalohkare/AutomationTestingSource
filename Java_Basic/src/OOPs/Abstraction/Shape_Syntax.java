package OOPs.Abstraction;

public abstract class Shape_Syntax extends ABC {

	
	/*can not create object of abstract class 
	 * method and class can be abstract 
	 *but variable can not be abstract
	 *Abstract method can be in abstract class only
	 *Abstract class can have instance method
	 *Abstract class can have static method
	 *instance and static method together calls concrete method
	 *can not  create object of abstract class
	 *abstract class can extend abstract class
	 */
	 
	
	int age = 40 ;
	String name = "Manda Lohkare" ;
	 
	
	// abstract method..
	public abstract double area();
	public abstract void shape();
	public abstract int  calculate();

	//non-abstract method./ instance method .
	public void display() {
		System.out.println("This is a display.");
	}
	
	//static method..
	public static void print() {
		System.out.println("print method.");
	}
}
