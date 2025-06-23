package OOPs.Inheritance.super_;

//3. Use of super with Constructors - to call immediate super class constructor

public class Usage_3 /*(Truck)*/ extends Vehicle 
{
	
	Usage_3()
	{
		super();
		System.out.println(" truck class constructor...");
		
	}

	public static void main(String[] args)
	{
		Usage_3 object = new Usage_3();

		System.out.println(object);//just to remove warning
		
	}

}
