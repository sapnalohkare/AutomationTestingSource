package OOPs.Inheritance.super_;

//1. Use of super with Variables-overridden or defined variable
public class Vehicle {
	
	int maxSpeed = 180;
   String color;
	
	Vehicle()
	{
		 this.color = "Black";
		 System.out.println("super constructor ..color :  "+color);
	}
	
	
	
	public void run() {
		System.out.println("Vehical is running...");
	}

	
	public void stops()
	{
		System.out.println("Vehical is stoped...");
	}
}
