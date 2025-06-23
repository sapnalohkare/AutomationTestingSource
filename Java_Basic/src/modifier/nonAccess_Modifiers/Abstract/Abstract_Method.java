package modifier.nonAccess_Modifiers.Abstract;

//abstract method does not have body...

public class Abstract_Method extends Engine {
	
	public static void main(String[] args) 
	{
		Abstract_Method extendedClass_object = new Abstract_Method();
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
