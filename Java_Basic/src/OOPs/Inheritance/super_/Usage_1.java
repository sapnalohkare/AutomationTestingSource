package OOPs.Inheritance.super_;

// 1) access parent class variable
public class Usage_1/*(Car)*/ extends Vehicle
{
    int maxSpeed = 200;
	
	public void display()
	{
		System.out.println("Car max speed  : "+maxSpeed);
		System.out.println("Vehical max speed  : "+super.maxSpeed);
	}
	public static void main(String[] args) 
	{
		Usage_1 object = new Usage_1();
		object.display();

	}

}
