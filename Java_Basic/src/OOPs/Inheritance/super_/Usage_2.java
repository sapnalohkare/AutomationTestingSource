package OOPs.Inheritance.super_;

//2. Use of super with Methods -overridden or defined method

public class Usage_2 /*(Activa)*/ extends Vehicle {

	
	public void display()
	{
		super.run();
		//run();
		super.stops();
		//stops();
	}
	
	public void run() {
		System.out.println("Activa is running...");
	}

	
	public void stops()
	{
		System.out.println("Activa is stoped...");
	}
	
	public static void main(String[] args) 
	{ 
		Usage_2  object = new Usage_2();
		object.display();
		

	}

}
