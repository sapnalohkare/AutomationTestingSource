package modifier.Method;


/*Abstract method: can only be used in an abstract class, and it does not have a body. 
The body is provided by the subclass (inherited from).*/


//engine class is Abstract having abstract method

public class Abstract extends Engine {
	
	public static void main(String[] args) 
	{
		Abstract extendedClass_object = new Abstract();
		extendedClass_object.engineRun();

	}

	@Override
	void engineRun() {
		
		System.out.println("Engine is running....");
		
	}

}


abstract class Engine
{
	//abstract method does not have body...
	abstract void engineRun();
	
	
}
